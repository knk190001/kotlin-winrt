package Windows.Networking.XboxLive

import Windows.Storage.Streams.IBuffer
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXboxLiveDeviceAddressStatics.ABI::class)
@Signature("{5954a819-4a79-4931-827c-7f503e963263}")
@Guid("5954a8194a794931827c7f503e963263")
@WinRTInterface("5954a8194a794931827c7f503e963263")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXboxLiveDeviceAddressStatics.ByReference::class)
public interface IXboxLiveDeviceAddressStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromSnapshotBase64(base64: String?): XboxLiveDeviceAddress?

  @InterfaceMethod(1)
  public fun CreateFromSnapshotBuffer(buffer: IBuffer?): XboxLiveDeviceAddress?

  @InterfaceMethod(2)
  public fun CreateFromSnapshotBytes(buffer: Array<Byte>): XboxLiveDeviceAddress?

  @InterfaceMethod(3)
  public fun GetLocal(): XboxLiveDeviceAddress?

  @InterfaceMethod(4)
  public fun get_MaxSnapshotBytesSize(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXboxLiveDeviceAddressStatics> {
    public override fun getValue() = ABI.makeIXboxLiveDeviceAddressStatics(pointer.getPointer(0))

    public fun setValue(value: IXboxLiveDeviceAddressStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXboxLiveDeviceAddressStatics {
    public val __538206657_Ptr: Pointer?

    public val _538206657_VtblPtr: Pointer?
      get() = __538206657_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromSnapshotBase64(base64: String?): XboxLiveDeviceAddress? {
      val fnPtr = _538206657_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveDeviceAddress>()
      val hr = fn.invokeHR(arrayOf(__538206657_Ptr, marshalToNative(base64), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveDeviceAddress>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromSnapshotBuffer(buffer: IBuffer?): XboxLiveDeviceAddress? {
      val fnPtr = _538206657_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveDeviceAddress>()
      val hr = fn.invokeHR(arrayOf(__538206657_Ptr, marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveDeviceAddress>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromSnapshotBytes(buffer: Array<Byte>): XboxLiveDeviceAddress? {
      val fnPtr = _538206657_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveDeviceAddress>()
      val hr = fn.invokeHR(arrayOf(__538206657_Ptr, buffer.size,marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveDeviceAddress>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetLocal(): XboxLiveDeviceAddress? {
      val fnPtr = _538206657_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveDeviceAddress>()
      val hr = fn.invokeHR(arrayOf(__538206657_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveDeviceAddress>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MaxSnapshotBytesSize(): WinDef.UINT {
      val fnPtr = _538206657_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__538206657_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IXboxLiveDeviceAddressStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __538206657_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXboxLiveDeviceAddressStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5954a8194a794931827c7f503e963263")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXboxLiveDeviceAddressStatics(ptr: Pointer?): WithDefault =
        IXboxLiveDeviceAddressStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXboxLiveDeviceAddressStatics {
      val address = segment.toRawLongValue()
      return makeIXboxLiveDeviceAddressStatics(Pointer(address))
    }

    public override fun toNative(obj: IXboxLiveDeviceAddressStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__538206657_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXboxLiveDeviceAddressStatics):
        Array<IXboxLiveDeviceAddressStatics?> = (elements as
        Array<IXboxLiveDeviceAddressStatics?>).castToImpl<IXboxLiveDeviceAddressStatics,IXboxLiveDeviceAddressStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXboxLiveDeviceAddressStatics?> =
        arrayOfNulls<IXboxLiveDeviceAddressStatics_Impl>(size) as
        Array<IXboxLiveDeviceAddressStatics?>
  }
}
