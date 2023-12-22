package Windows.Media.Devices

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(ICameraOcclusionInfo.ABI::class)
@Signature("{af6c4ad0-a84d-5db6-be58-a5da21cfe011}")
@Guid("af6c4ad0a84d5db6be58a5da21cfe011")
@WinRTInterface("af6c4ad0a84d5db6be58a5da21cfe011")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICameraOcclusionInfo.ByReference::class)
public interface ICameraOcclusionInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetState(): CameraOcclusionState?

  @InterfaceMethod(1)
  public fun IsOcclusionKindSupported(occlusionKind: CameraOcclusionKind?): Boolean

  @InterfaceMethod(2)
  public fun add_StateChanged(handler: TypedEventHandler<CameraOcclusionInfo?,
      CameraOcclusionStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_StateChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICameraOcclusionInfo> {
    public override fun getValue() = ABI.makeICameraOcclusionInfo(pointer.getPointer(0))

    public fun setValue(value: ICameraOcclusionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICameraOcclusionInfo {
    public val __1398738443_Ptr: Pointer?

    public val _1398738443_VtblPtr: Pointer?
      get() = __1398738443_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetState(): CameraOcclusionState? {
      val fnPtr = _1398738443_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CameraOcclusionState>()
      val hr = fn.invokeHR(arrayOf(__1398738443_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CameraOcclusionState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun IsOcclusionKindSupported(occlusionKind: CameraOcclusionKind?): Boolean {
      val fnPtr = _1398738443_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1398738443_Ptr, marshalToNative(occlusionKind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun add_StateChanged(handler: TypedEventHandler<CameraOcclusionInfo?,
        CameraOcclusionStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1398738443_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1398738443_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_StateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1398738443_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1398738443_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICameraOcclusionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1398738443_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICameraOcclusionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("af6c4ad0a84d5db6be58a5da21cfe011")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICameraOcclusionInfo(ptr: Pointer?): WithDefault = ICameraOcclusionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICameraOcclusionInfo {
      val address = segment.toRawLongValue()
      return makeICameraOcclusionInfo(Pointer(address))
    }

    public override fun toNative(obj: ICameraOcclusionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1398738443_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICameraOcclusionInfo): Array<ICameraOcclusionInfo?> =
        (elements as
        Array<ICameraOcclusionInfo?>).castToImpl<ICameraOcclusionInfo,ICameraOcclusionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICameraOcclusionInfo?> =
        arrayOfNulls<ICameraOcclusionInfo_Impl>(size) as Array<ICameraOcclusionInfo?>
  }
}
