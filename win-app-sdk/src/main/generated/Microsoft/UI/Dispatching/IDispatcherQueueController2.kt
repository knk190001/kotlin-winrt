package Microsoft.UI.Dispatching

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

@ABIMarker(IDispatcherQueueController2.ABI::class)
@Signature("{4c68ee2a-1cb1-5591-a3a2-9b590b8f8b9a}")
@Guid("4c68ee2a1cb15591a3a29b590b8f8b9a")
@WinRTInterface("4c68ee2a1cb15591a3a29b590b8f8b9a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDispatcherQueueController2.ByReference::class)
public interface IDispatcherQueueController2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShutdownQueue(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDispatcherQueueController2> {
    public override fun getValue() = ABI.makeIDispatcherQueueController2(pointer.getPointer(0))

    public fun setValue(value: IDispatcherQueueController2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDispatcherQueueController2 {
    public val __895838297_Ptr: Pointer?

    public val _895838297_VtblPtr: Pointer?
      get() = __895838297_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShutdownQueue(): Unit {
      val fnPtr = _895838297_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__895838297_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDispatcherQueueController2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __895838297_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDispatcherQueueController2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4c68ee2a1cb15591a3a29b590b8f8b9a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDispatcherQueueController2(ptr: Pointer?): WithDefault =
        IDispatcherQueueController2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDispatcherQueueController2 {
      val address = segment.toRawLongValue()
      return makeIDispatcherQueueController2(Pointer(address))
    }

    public override fun toNative(obj: IDispatcherQueueController2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__895838297_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDispatcherQueueController2):
        Array<IDispatcherQueueController2?> = (elements as
        Array<IDispatcherQueueController2?>).castToImpl<IDispatcherQueueController2,IDispatcherQueueController2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDispatcherQueueController2?> =
        arrayOfNulls<IDispatcherQueueController2_Impl>(size) as Array<IDispatcherQueueController2?>
  }
}
