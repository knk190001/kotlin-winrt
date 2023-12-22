package Windows.Media.Miracast

import Windows.Graphics.SizeInt32
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

@ABIMarker(IMiracastReceiverVideoStreamSettings.ABI::class)
@Signature("{169b5e1b-149d-52d0-b126-6f89744e4f50}")
@Guid("169b5e1b149d52d0b1266f89744e4f50")
@WinRTInterface("169b5e1b149d52d0b1266f89744e4f50")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastReceiverVideoStreamSettings.ByReference::class)
public interface IMiracastReceiverVideoStreamSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Size(): SizeInt32?

  @InterfaceMethod(1)
  public fun put_Size(value: SizeInt32?): Unit

  @InterfaceMethod(2)
  public fun get_Bitrate(): Int

  @InterfaceMethod(3)
  public fun put_Bitrate(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastReceiverVideoStreamSettings> {
    public override fun getValue() =
        ABI.makeIMiracastReceiverVideoStreamSettings(pointer.getPointer(0))

    public fun setValue(value: IMiracastReceiverVideoStreamSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastReceiverVideoStreamSettings {
    public val __1757455803_Ptr: Pointer?

    public val _1757455803_VtblPtr: Pointer?
      get() = __1757455803_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Size(): SizeInt32? {
      val fnPtr = _1757455803_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SizeInt32>()
      val hr = fn.invokeHR(arrayOf(__1757455803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SizeInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Size(value: SizeInt32?): Unit {
      val fnPtr = _1757455803_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1757455803_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Bitrate(): Int {
      val fnPtr = _1757455803_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1757455803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Bitrate(value: Int): Unit {
      val fnPtr = _1757455803_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1757455803_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMiracastReceiverVideoStreamSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1757455803_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastReceiverVideoStreamSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("169b5e1b149d52d0b1266f89744e4f50")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastReceiverVideoStreamSettings(ptr: Pointer?): WithDefault =
        IMiracastReceiverVideoStreamSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMiracastReceiverVideoStreamSettings {
      val address = segment.toRawLongValue()
      return makeIMiracastReceiverVideoStreamSettings(Pointer(address))
    }

    public override fun toNative(obj: IMiracastReceiverVideoStreamSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1757455803_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastReceiverVideoStreamSettings):
        Array<IMiracastReceiverVideoStreamSettings?> = (elements as
        Array<IMiracastReceiverVideoStreamSettings?>).castToImpl<IMiracastReceiverVideoStreamSettings,IMiracastReceiverVideoStreamSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastReceiverVideoStreamSettings?> =
        arrayOfNulls<IMiracastReceiverVideoStreamSettings_Impl>(size) as
        Array<IMiracastReceiverVideoStreamSettings?>
  }
}
