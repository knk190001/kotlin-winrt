package Windows.System

import Windows.Foundation.TimeSpan
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

@ABIMarker(IShutdownManagerStatics.ABI::class)
@Signature("{72e247ed-dd5b-4d6c-b1d0-c57a7bbb5f94}")
@Guid("72e247eddd5b4d6cb1d0c57a7bbb5f94")
@WinRTInterface("72e247eddd5b4d6cb1d0c57a7bbb5f94")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShutdownManagerStatics.ByReference::class)
public interface IShutdownManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun BeginShutdown(shutdownKind: ShutdownKind?, timeout: TimeSpan?): Unit

  @InterfaceMethod(1)
  public fun CancelShutdown(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IShutdownManagerStatics> {
    public override fun getValue() = ABI.makeIShutdownManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IShutdownManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShutdownManagerStatics {
    public val __1111120253_Ptr: Pointer?

    public val _1111120253_VtblPtr: Pointer?
      get() = __1111120253_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun BeginShutdown(shutdownKind: ShutdownKind?, timeout: TimeSpan?): Unit {
      val fnPtr = _1111120253_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1111120253_Ptr, marshalToNative(shutdownKind),
          marshalToNative(timeout),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun CancelShutdown(): Unit {
      val fnPtr = _1111120253_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1111120253_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IShutdownManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1111120253_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShutdownManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("72e247eddd5b4d6cb1d0c57a7bbb5f94")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShutdownManagerStatics(ptr: Pointer?): WithDefault =
        IShutdownManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShutdownManagerStatics {
      val address = segment.toRawLongValue()
      return makeIShutdownManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IShutdownManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1111120253_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShutdownManagerStatics): Array<IShutdownManagerStatics?>
        = (elements as
        Array<IShutdownManagerStatics?>).castToImpl<IShutdownManagerStatics,IShutdownManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShutdownManagerStatics?> =
        arrayOfNulls<IShutdownManagerStatics_Impl>(size) as Array<IShutdownManagerStatics?>
  }
}
