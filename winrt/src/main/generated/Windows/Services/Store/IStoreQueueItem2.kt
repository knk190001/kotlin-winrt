package Windows.Services.Store

import Windows.Foundation.IAsyncAction
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IStoreQueueItem2.ABI::class)
@Signature("{69491ca8-1ad4-447c-ad8c-a95035f64d82}")
@Guid("69491ca81ad4447cad8ca95035f64d82")
@WinRTInterface("69491ca81ad4447cad8ca95035f64d82")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreQueueItem2.ByReference::class)
public interface IStoreQueueItem2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CancelInstallAsync(): IAsyncAction?

  @InterfaceMethod(1)
  public fun PauseInstallAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun ResumeInstallAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreQueueItem2> {
    public override fun getValue() = ABI.makeIStoreQueueItem2(pointer.getPointer(0))

    public fun setValue(value: IStoreQueueItem2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreQueueItem2 {
    public val __206558050_Ptr: Pointer?

    public val _206558050_VtblPtr: Pointer?
      get() = __206558050_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CancelInstallAsync(): IAsyncAction? {
      val fnPtr = _206558050_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__206558050_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun PauseInstallAsync(): IAsyncAction? {
      val fnPtr = _206558050_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__206558050_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ResumeInstallAsync(): IAsyncAction? {
      val fnPtr = _206558050_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__206558050_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IStoreQueueItem2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __206558050_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreQueueItem2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69491ca81ad4447cad8ca95035f64d82")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreQueueItem2(ptr: Pointer?): WithDefault = IStoreQueueItem2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreQueueItem2 {
      val address = segment.toRawLongValue()
      return makeIStoreQueueItem2(Pointer(address))
    }

    public override fun toNative(obj: IStoreQueueItem2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__206558050_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreQueueItem2): Array<IStoreQueueItem2?> = (elements as
        Array<IStoreQueueItem2?>).castToImpl<IStoreQueueItem2,IStoreQueueItem2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreQueueItem2?> =
        arrayOfNulls<IStoreQueueItem2_Impl>(size) as Array<IStoreQueueItem2?>
  }
}
