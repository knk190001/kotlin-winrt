package Windows.Media.Devices

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

@ABIMarker(IRegionOfInterest2.ABI::class)
@Signature("{19fe2a91-73aa-4d51-8a9d-56ccf7db7f54}")
@Guid("19fe2a9173aa4d518a9d56ccf7db7f54")
@WinRTInterface("19fe2a9173aa4d518a9d56ccf7db7f54")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRegionOfInterest2.ByReference::class)
public interface IRegionOfInterest2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): RegionOfInterestType?

  @InterfaceMethod(1)
  public fun put_Type(value: RegionOfInterestType?): Unit

  @InterfaceMethod(2)
  public fun get_BoundsNormalized(): Boolean

  @InterfaceMethod(3)
  public fun put_BoundsNormalized(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_Weight(): WinDef.UINT

  @InterfaceMethod(5)
  public fun put_Weight(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRegionOfInterest2> {
    public override fun getValue() = ABI.makeIRegionOfInterest2(pointer.getPointer(0))

    public fun setValue(value: IRegionOfInterest2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRegionOfInterest2 {
    public val __1846962076_Ptr: Pointer?

    public val _1846962076_VtblPtr: Pointer?
      get() = __1846962076_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): RegionOfInterestType? {
      val fnPtr = _1846962076_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RegionOfInterestType>()
      val hr = fn.invokeHR(arrayOf(__1846962076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RegionOfInterestType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Type(value: RegionOfInterestType?): Unit {
      val fnPtr = _1846962076_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1846962076_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BoundsNormalized(): Boolean {
      val fnPtr = _1846962076_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1846962076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_BoundsNormalized(value: Boolean): Unit {
      val fnPtr = _1846962076_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1846962076_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Weight(): WinDef.UINT {
      val fnPtr = _1846962076_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1846962076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Weight(value: WinDef.UINT): Unit {
      val fnPtr = _1846962076_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1846962076_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRegionOfInterest2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1846962076_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRegionOfInterest2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("19fe2a9173aa4d518a9d56ccf7db7f54")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRegionOfInterest2(ptr: Pointer?): WithDefault = IRegionOfInterest2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRegionOfInterest2 {
      val address = segment.toRawLongValue()
      return makeIRegionOfInterest2(Pointer(address))
    }

    public override fun toNative(obj: IRegionOfInterest2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1846962076_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRegionOfInterest2): Array<IRegionOfInterest2?> =
        (elements as
        Array<IRegionOfInterest2?>).castToImpl<IRegionOfInterest2,IRegionOfInterest2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRegionOfInterest2?> =
        arrayOfNulls<IRegionOfInterest2_Impl>(size) as Array<IRegionOfInterest2?>
  }
}
