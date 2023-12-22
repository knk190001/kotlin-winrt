package Windows.Networking.XboxLive

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Boolean
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXboxLiveDeviceAddress.ABI::class)
@Signature("{f5bbd279-3c86-4b57-a31a-b9462408fd01}")
@Guid("f5bbd2793c864b57a31ab9462408fd01")
@WinRTInterface("f5bbd2793c864b57a31ab9462408fd01")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXboxLiveDeviceAddress.ByReference::class)
public interface IXboxLiveDeviceAddress : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_SnapshotChanged(handler: TypedEventHandler<XboxLiveDeviceAddress?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SnapshotChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun GetSnapshotAsBase64(): String?

  @InterfaceMethod(3)
  public fun GetSnapshotAsBuffer(): IBuffer?

  @InterfaceMethod(4)
  public fun GetSnapshotAsBytes(buffer: Array<Byte>, bytesWritten: WinDef.UINT): Unit

  @InterfaceMethod(5)
  public fun Compare(otherDeviceAddress: XboxLiveDeviceAddress?): Int

  @InterfaceMethod(6)
  public fun get_IsValid(): Boolean

  @InterfaceMethod(7)
  public fun get_IsLocal(): Boolean

  @InterfaceMethod(8)
  public fun get_NetworkAccessKind(): XboxLiveNetworkAccessKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXboxLiveDeviceAddress> {
    public override fun getValue() = ABI.makeIXboxLiveDeviceAddress(pointer.getPointer(0))

    public fun setValue(value: IXboxLiveDeviceAddress_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXboxLiveDeviceAddress {
    public val __809820828_Ptr: Pointer?

    public val _809820828_VtblPtr: Pointer?
      get() = __809820828_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_SnapshotChanged(handler: TypedEventHandler<XboxLiveDeviceAddress?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _809820828_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__809820828_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SnapshotChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _809820828_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__809820828_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetSnapshotAsBase64(): String? {
      val fnPtr = _809820828_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__809820828_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetSnapshotAsBuffer(): IBuffer? {
      val fnPtr = _809820828_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__809820828_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetSnapshotAsBytes(buffer: Array<Byte>, bytesWritten: WinDef.UINT): Unit {
      val fnPtr = _809820828_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__809820828_Ptr, buffer.size,marshalToNative(buffer),
          bytesWritten,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Compare(otherDeviceAddress: XboxLiveDeviceAddress?): Int {
      val fnPtr = _809820828_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__809820828_Ptr, marshalToNative(otherDeviceAddress), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IsValid(): Boolean {
      val fnPtr = _809820828_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__809820828_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_IsLocal(): Boolean {
      val fnPtr = _809820828_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__809820828_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_NetworkAccessKind(): XboxLiveNetworkAccessKind? {
      val fnPtr = _809820828_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveNetworkAccessKind>()
      val hr = fn.invokeHR(arrayOf(__809820828_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveNetworkAccessKind>(result.getValue())
      return resultValue
    }
  }

  public class IXboxLiveDeviceAddress_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __809820828_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXboxLiveDeviceAddress, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f5bbd2793c864b57a31ab9462408fd01")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXboxLiveDeviceAddress(ptr: Pointer?): WithDefault =
        IXboxLiveDeviceAddress_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXboxLiveDeviceAddress {
      val address = segment.toRawLongValue()
      return makeIXboxLiveDeviceAddress(Pointer(address))
    }

    public override fun toNative(obj: IXboxLiveDeviceAddress): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__809820828_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXboxLiveDeviceAddress): Array<IXboxLiveDeviceAddress?> =
        (elements as
        Array<IXboxLiveDeviceAddress?>).castToImpl<IXboxLiveDeviceAddress,IXboxLiveDeviceAddress_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXboxLiveDeviceAddress?> =
        arrayOfNulls<IXboxLiveDeviceAddress_Impl>(size) as Array<IXboxLiveDeviceAddress?>
  }
}
