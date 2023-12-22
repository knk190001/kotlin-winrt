package Windows.Phone.Notification.Management

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVolumeInfo.ABI::class)
@Signature("{944dd118-7704-4481-b92e-d3ed3ece6322}")
@Guid("944dd11877044481b92ed3ed3ece6322")
@WinRTInterface("944dd11877044481b92ed3ed3ece6322")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVolumeInfo.ByReference::class)
public interface IVolumeInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SystemVolume(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_CallVolume(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_MediaVolume(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_IsMuted(): Boolean

  @InterfaceMethod(4)
  public fun get_IsVibrateEnabled(): VibrateState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVolumeInfo> {
    public override fun getValue() = ABI.makeIVolumeInfo(pointer.getPointer(0))

    public fun setValue(value: IVolumeInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVolumeInfo {
    public val __583095030_Ptr: Pointer?

    public val _583095030_VtblPtr: Pointer?
      get() = __583095030_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SystemVolume(): WinDef.UINT {
      val fnPtr = _583095030_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__583095030_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CallVolume(): WinDef.UINT {
      val fnPtr = _583095030_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__583095030_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MediaVolume(): WinDef.UINT {
      val fnPtr = _583095030_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__583095030_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsMuted(): Boolean {
      val fnPtr = _583095030_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__583095030_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsVibrateEnabled(): VibrateState? {
      val fnPtr = _583095030_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VibrateState>()
      val hr = fn.invokeHR(arrayOf(__583095030_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VibrateState>(result.getValue())
      return resultValue
    }
  }

  public class IVolumeInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __583095030_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVolumeInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("944dd11877044481b92ed3ed3ece6322")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVolumeInfo(ptr: Pointer?): WithDefault = IVolumeInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVolumeInfo {
      val address = segment.toRawLongValue()
      return makeIVolumeInfo(Pointer(address))
    }

    public override fun toNative(obj: IVolumeInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__583095030_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVolumeInfo): Array<IVolumeInfo?> = (elements as
        Array<IVolumeInfo?>).castToImpl<IVolumeInfo,IVolumeInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVolumeInfo?> =
        arrayOfNulls<IVolumeInfo_Impl>(size) as Array<IVolumeInfo?>
  }
}
