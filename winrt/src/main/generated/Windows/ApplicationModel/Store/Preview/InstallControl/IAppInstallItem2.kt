package Windows.ApplicationModel.Store.Preview.InstallControl

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppInstallItem2.ABI::class)
@Signature("{d3972af8-40c0-4fd7-aa6c-0aa13ca6188c}")
@Guid("d3972af840c04fd7aa6c0aa13ca6188c")
@WinRTInterface("d3972af840c04fd7aa6c0aa13ca6188c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallItem2.ByReference::class)
public interface IAppInstallItem2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Cancel(correlationVector: String?): Unit

  @InterfaceMethod(1)
  public fun Pause(correlationVector: String?): Unit

  @InterfaceMethod(2)
  public fun Restart(correlationVector: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallItem2> {
    public override fun getValue() = ABI.makeIAppInstallItem2(pointer.getPointer(0))

    public fun setValue(value: IAppInstallItem2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallItem2 {
    public val __972005819_Ptr: Pointer?

    public val _972005819_VtblPtr: Pointer?
      get() = __972005819_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Cancel(correlationVector: String?): Unit {
      val fnPtr = _972005819_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__972005819_Ptr, marshalToNative(correlationVector),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Pause(correlationVector: String?): Unit {
      val fnPtr = _972005819_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__972005819_Ptr, marshalToNative(correlationVector),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Restart(correlationVector: String?): Unit {
      val fnPtr = _972005819_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__972005819_Ptr, marshalToNative(correlationVector),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppInstallItem2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __972005819_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallItem2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d3972af840c04fd7aa6c0aa13ca6188c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallItem2(ptr: Pointer?): WithDefault = IAppInstallItem2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallItem2 {
      val address = segment.toRawLongValue()
      return makeIAppInstallItem2(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallItem2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__972005819_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallItem2): Array<IAppInstallItem2?> = (elements as
        Array<IAppInstallItem2?>).castToImpl<IAppInstallItem2,IAppInstallItem2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallItem2?> =
        arrayOfNulls<IAppInstallItem2_Impl>(size) as Array<IAppInstallItem2?>
  }
}
