package Windows.Media.PlayTo

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

@ABIMarker(IPlayToManagerStatics.ABI::class)
@Signature("{64e6a887-3982-4f3b-ba20-6155e435325b}")
@Guid("64e6a88739824f3bba206155e435325b")
@WinRTInterface("64e6a88739824f3bba206155e435325b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayToManagerStatics.ByReference::class)
public interface IPlayToManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): PlayToManager?

  @InterfaceMethod(1)
  public fun ShowPlayToUI(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayToManagerStatics> {
    public override fun getValue() = ABI.makeIPlayToManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IPlayToManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayToManagerStatics {
    public val __2090526100_Ptr: Pointer?

    public val _2090526100_VtblPtr: Pointer?
      get() = __2090526100_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): PlayToManager? {
      val fnPtr = _2090526100_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayToManager>()
      val hr = fn.invokeHR(arrayOf(__2090526100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayToManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ShowPlayToUI(): Unit {
      val fnPtr = _2090526100_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2090526100_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPlayToManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2090526100_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayToManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64e6a88739824f3bba206155e435325b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayToManagerStatics(ptr: Pointer?): WithDefault =
        IPlayToManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayToManagerStatics {
      val address = segment.toRawLongValue()
      return makeIPlayToManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPlayToManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2090526100_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayToManagerStatics): Array<IPlayToManagerStatics?> =
        (elements as
        Array<IPlayToManagerStatics?>).castToImpl<IPlayToManagerStatics,IPlayToManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayToManagerStatics?> =
        arrayOfNulls<IPlayToManagerStatics_Impl>(size) as Array<IPlayToManagerStatics?>
  }
}
