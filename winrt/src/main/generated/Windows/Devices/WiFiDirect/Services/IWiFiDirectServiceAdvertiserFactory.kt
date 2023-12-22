package Windows.Devices.WiFiDirect.Services

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

@ABIMarker(IWiFiDirectServiceAdvertiserFactory.ABI::class)
@Signature("{3106ac0d-b446-4f13-9f9a-8ae925feba2b}")
@Guid("3106ac0db4464f139f9a8ae925feba2b")
@WinRTInterface("3106ac0db4464f139f9a8ae925feba2b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectServiceAdvertiserFactory.ByReference::class)
public interface IWiFiDirectServiceAdvertiserFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWiFiDirectServiceAdvertiser(serviceName: String?): WiFiDirectServiceAdvertiser?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectServiceAdvertiserFactory> {
    public override fun getValue() =
        ABI.makeIWiFiDirectServiceAdvertiserFactory(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectServiceAdvertiserFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectServiceAdvertiserFactory {
    public val __1644771487_Ptr: Pointer?

    public val _1644771487_VtblPtr: Pointer?
      get() = __1644771487_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWiFiDirectServiceAdvertiser(serviceName: String?):
        WiFiDirectServiceAdvertiser? {
      val fnPtr = _1644771487_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectServiceAdvertiser>()
      val hr = fn.invokeHR(arrayOf(__1644771487_Ptr, marshalToNative(serviceName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiDirectServiceAdvertiser>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiDirectServiceAdvertiserFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1644771487_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectServiceAdvertiserFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3106ac0db4464f139f9a8ae925feba2b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectServiceAdvertiserFactory(ptr: Pointer?): WithDefault =
        IWiFiDirectServiceAdvertiserFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectServiceAdvertiserFactory {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectServiceAdvertiserFactory(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectServiceAdvertiserFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1644771487_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectServiceAdvertiserFactory):
        Array<IWiFiDirectServiceAdvertiserFactory?> = (elements as
        Array<IWiFiDirectServiceAdvertiserFactory?>).castToImpl<IWiFiDirectServiceAdvertiserFactory,IWiFiDirectServiceAdvertiserFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectServiceAdvertiserFactory?> =
        arrayOfNulls<IWiFiDirectServiceAdvertiserFactory_Impl>(size) as
        Array<IWiFiDirectServiceAdvertiserFactory?>
  }
}
