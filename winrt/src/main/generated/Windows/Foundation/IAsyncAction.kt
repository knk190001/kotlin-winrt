package Windows.Foundation

import Windows.Foundation.IAsyncInfo.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAsyncAction.ABI::class)
@Signature("{5a648006-843a-4da9-865b-9d26e5dfad7b}")
@Guid("5a648006843a4da9865b9d26e5dfad7b")
@WinRTInterface("5a648006843a4da9865b9d26e5dfad7b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAsyncAction.ByReference::class)
public interface IAsyncAction : NativeMapped, IWinRTInterface, IAsyncInfo {
  @InterfaceMethod(0)
  public fun put_Completed(handler: AsyncActionCompletedHandler?): Unit

  @InterfaceMethod(1)
  public fun get_Completed(): AsyncActionCompletedHandler?

  @InterfaceMethod(2)
  public fun GetResults(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAsyncAction> {
    public override fun getValue() = ABI.makeIAsyncAction(pointer.getPointer(0))

    public fun setValue(value: IAsyncAction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAsyncAction, IAsyncInfo.WithDefault {
    public val __2120156153_Ptr: Pointer?

    public val _2120156153_VtblPtr: Pointer?
      get() = __2120156153_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Completed(handler: AsyncActionCompletedHandler?): Unit {
      val fnPtr = _2120156153_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2120156153_Ptr, marshalToNative(handler),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Completed(): AsyncActionCompletedHandler? {
      val fnPtr = _2120156153_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AsyncActionCompletedHandler>()
      val hr = fn.invokeHR(arrayOf(__2120156153_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AsyncActionCompletedHandler>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetResults(): Unit {
      val fnPtr = _2120156153_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2120156153_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAsyncAction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAsyncInfo {
    public override val __1646648641_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2120156153_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2120156153_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAsyncAction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5a648006843a4da9865b9d26e5dfad7b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAsyncAction(ptr: Pointer?): WithDefault = IAsyncAction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAsyncAction {
      val address = segment.toRawLongValue()
      return makeIAsyncAction(Pointer(address))
    }

    public override fun toNative(obj: IAsyncAction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2120156153_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncAction): Array<IAsyncAction?> = (elements as
        Array<IAsyncAction?>).castToImpl<IAsyncAction,IAsyncAction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncAction?> =
        arrayOfNulls<IAsyncAction_Impl>(size) as Array<IAsyncAction?>
  }
}
