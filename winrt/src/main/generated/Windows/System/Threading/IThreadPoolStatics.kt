package Windows.System.Threading

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

@ABIMarker(IThreadPoolStatics.ABI::class)
@Signature("{b6bf67dd-84bd-44f8-ac1c-93ebcb9dba91}")
@Guid("b6bf67dd84bd44f8ac1c93ebcb9dba91")
@WinRTInterface("b6bf67dd84bd44f8ac1c93ebcb9dba91")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IThreadPoolStatics.ByReference::class)
public interface IThreadPoolStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RunAsync(handler: WorkItemHandler?): IAsyncAction?

  @InterfaceMethod(1)
  public fun RunAsync(handler: WorkItemHandler?, priority: WorkItemPriority?): IAsyncAction?

  @InterfaceMethod(2)
  public fun RunAsync(
    handler: WorkItemHandler?,
    priority: WorkItemPriority?,
    options: WorkItemOptions?
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IThreadPoolStatics> {
    public override fun getValue() = ABI.makeIThreadPoolStatics(pointer.getPointer(0))

    public fun setValue(value: IThreadPoolStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IThreadPoolStatics {
    public val __1635317274_Ptr: Pointer?

    public val _1635317274_VtblPtr: Pointer?
      get() = __1635317274_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RunAsync(handler: WorkItemHandler?): IAsyncAction? {
      val fnPtr = _1635317274_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1635317274_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RunAsync(handler: WorkItemHandler?, priority: WorkItemPriority?):
        IAsyncAction? {
      val fnPtr = _1635317274_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1635317274_Ptr, marshalToNative(handler),
          marshalToNative(priority), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RunAsync(
      handler: WorkItemHandler?,
      priority: WorkItemPriority?,
      options: WorkItemOptions?
    ): IAsyncAction? {
      val fnPtr = _1635317274_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1635317274_Ptr, marshalToNative(handler),
          marshalToNative(priority), marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IThreadPoolStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1635317274_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IThreadPoolStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6bf67dd84bd44f8ac1c93ebcb9dba91")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIThreadPoolStatics(ptr: Pointer?): WithDefault = IThreadPoolStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IThreadPoolStatics {
      val address = segment.toRawLongValue()
      return makeIThreadPoolStatics(Pointer(address))
    }

    public override fun toNative(obj: IThreadPoolStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1635317274_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IThreadPoolStatics): Array<IThreadPoolStatics?> =
        (elements as
        Array<IThreadPoolStatics?>).castToImpl<IThreadPoolStatics,IThreadPoolStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IThreadPoolStatics?> =
        arrayOfNulls<IThreadPoolStatics_Impl>(size) as Array<IThreadPoolStatics?>
  }
}
