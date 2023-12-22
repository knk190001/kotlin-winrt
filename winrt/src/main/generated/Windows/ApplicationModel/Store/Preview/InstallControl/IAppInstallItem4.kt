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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppInstallItem4.ABI::class)
@Signature("{c2d1ce12-71ff-4fc8-b540-453d4b37e1d1}")
@Guid("c2d1ce1271ff4fc8b540453d4b37e1d1")
@WinRTInterface("c2d1ce1271ff4fc8b540453d4b37e1d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallItem4.ByReference::class)
public interface IAppInstallItem4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LaunchAfterInstall(): Boolean

  @InterfaceMethod(1)
  public fun put_LaunchAfterInstall(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallItem4> {
    public override fun getValue() = ABI.makeIAppInstallItem4(pointer.getPointer(0))

    public fun setValue(value: IAppInstallItem4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallItem4 {
    public val __972005821_Ptr: Pointer?

    public val _972005821_VtblPtr: Pointer?
      get() = __972005821_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LaunchAfterInstall(): Boolean {
      val fnPtr = _972005821_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__972005821_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_LaunchAfterInstall(value: Boolean): Unit {
      val fnPtr = _972005821_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__972005821_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppInstallItem4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __972005821_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallItem4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c2d1ce1271ff4fc8b540453d4b37e1d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallItem4(ptr: Pointer?): WithDefault = IAppInstallItem4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallItem4 {
      val address = segment.toRawLongValue()
      return makeIAppInstallItem4(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallItem4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__972005821_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallItem4): Array<IAppInstallItem4?> = (elements as
        Array<IAppInstallItem4?>).castToImpl<IAppInstallItem4,IAppInstallItem4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallItem4?> =
        arrayOfNulls<IAppInstallItem4_Impl>(size) as Array<IAppInstallItem4?>
  }
}
