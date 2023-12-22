package Windows.Media.Miracast

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMiracastReceiverSettings.ABI::class)
@Signature("{57cd2f24-c55a-5fbe-9464-eb05307705dd}")
@Guid("57cd2f24c55a5fbe9464eb05307705dd")
@WinRTInterface("57cd2f24c55a5fbe9464eb05307705dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastReceiverSettings.ByReference::class)
public interface IMiracastReceiverSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FriendlyName(): String?

  @InterfaceMethod(1)
  public fun put_FriendlyName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_ModelName(): String?

  @InterfaceMethod(3)
  public fun put_ModelName(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_ModelNumber(): String?

  @InterfaceMethod(5)
  public fun put_ModelNumber(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_AuthorizationMethod(): MiracastReceiverAuthorizationMethod?

  @InterfaceMethod(7)
  public fun put_AuthorizationMethod(value: MiracastReceiverAuthorizationMethod?): Unit

  @InterfaceMethod(8)
  public fun get_RequireAuthorizationFromKnownTransmitters(): Boolean

  @InterfaceMethod(9)
  public fun put_RequireAuthorizationFromKnownTransmitters(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastReceiverSettings> {
    public override fun getValue() = ABI.makeIMiracastReceiverSettings(pointer.getPointer(0))

    public fun setValue(value: IMiracastReceiverSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastReceiverSettings {
    public val __625226662_Ptr: Pointer?

    public val _625226662_VtblPtr: Pointer?
      get() = __625226662_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FriendlyName(): String? {
      val fnPtr = _625226662_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__625226662_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_FriendlyName(value: String?): Unit {
      val fnPtr = _625226662_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__625226662_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ModelName(): String? {
      val fnPtr = _625226662_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__625226662_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ModelName(value: String?): Unit {
      val fnPtr = _625226662_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__625226662_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ModelNumber(): String? {
      val fnPtr = _625226662_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__625226662_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ModelNumber(value: String?): Unit {
      val fnPtr = _625226662_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__625226662_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_AuthorizationMethod(): MiracastReceiverAuthorizationMethod? {
      val fnPtr = _625226662_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverAuthorizationMethod>()
      val hr = fn.invokeHR(arrayOf(__625226662_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverAuthorizationMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_AuthorizationMethod(value: MiracastReceiverAuthorizationMethod?): Unit {
      val fnPtr = _625226662_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__625226662_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_RequireAuthorizationFromKnownTransmitters(): Boolean {
      val fnPtr = _625226662_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__625226662_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_RequireAuthorizationFromKnownTransmitters(value: Boolean): Unit {
      val fnPtr = _625226662_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__625226662_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMiracastReceiverSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __625226662_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastReceiverSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("57cd2f24c55a5fbe9464eb05307705dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastReceiverSettings(ptr: Pointer?): WithDefault =
        IMiracastReceiverSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMiracastReceiverSettings {
      val address = segment.toRawLongValue()
      return makeIMiracastReceiverSettings(Pointer(address))
    }

    public override fun toNative(obj: IMiracastReceiverSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__625226662_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastReceiverSettings):
        Array<IMiracastReceiverSettings?> = (elements as
        Array<IMiracastReceiverSettings?>).castToImpl<IMiracastReceiverSettings,IMiracastReceiverSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastReceiverSettings?> =
        arrayOfNulls<IMiracastReceiverSettings_Impl>(size) as Array<IMiracastReceiverSettings?>
  }
}
