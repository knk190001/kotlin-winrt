package Windows.Networking.NetworkOperators

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IMobileBroadbandCellsInfo.ABI::class)
@Signature("{89a9562a-e472-4da5-929c-de61711dd261}")
@Guid("89a9562ae4724da5929cde61711dd261")
@WinRTInterface("89a9562ae4724da5929cde61711dd261")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandCellsInfo.ByReference::class)
public interface IMobileBroadbandCellsInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NeighboringCellsCdma(): IVectorView<MobileBroadbandCellCdma?>?

  @InterfaceMethod(1)
  public fun get_NeighboringCellsGsm(): IVectorView<MobileBroadbandCellGsm?>?

  @InterfaceMethod(2)
  public fun get_NeighboringCellsLte(): IVectorView<MobileBroadbandCellLte?>?

  @InterfaceMethod(3)
  public fun get_NeighboringCellsTdscdma(): IVectorView<MobileBroadbandCellTdscdma?>?

  @InterfaceMethod(4)
  public fun get_NeighboringCellsUmts(): IVectorView<MobileBroadbandCellUmts?>?

  @InterfaceMethod(5)
  public fun get_ServingCellsCdma(): IVectorView<MobileBroadbandCellCdma?>?

  @InterfaceMethod(6)
  public fun get_ServingCellsGsm(): IVectorView<MobileBroadbandCellGsm?>?

  @InterfaceMethod(7)
  public fun get_ServingCellsLte(): IVectorView<MobileBroadbandCellLte?>?

  @InterfaceMethod(8)
  public fun get_ServingCellsTdscdma(): IVectorView<MobileBroadbandCellTdscdma?>?

  @InterfaceMethod(9)
  public fun get_ServingCellsUmts(): IVectorView<MobileBroadbandCellUmts?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandCellsInfo> {
    public override fun getValue() = ABI.makeIMobileBroadbandCellsInfo(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandCellsInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandCellsInfo {
    public val __1619612899_Ptr: Pointer?

    public val _1619612899_VtblPtr: Pointer?
      get() = __1619612899_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NeighboringCellsCdma(): IVectorView<MobileBroadbandCellCdma?>? {
      val fnPtr = _1619612899_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandCellCdma?>>()
      val hr = fn.invokeHR(arrayOf(__1619612899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MobileBroadbandCellCdma?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NeighboringCellsGsm(): IVectorView<MobileBroadbandCellGsm?>? {
      val fnPtr = _1619612899_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandCellGsm?>>()
      val hr = fn.invokeHR(arrayOf(__1619612899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MobileBroadbandCellGsm?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NeighboringCellsLte(): IVectorView<MobileBroadbandCellLte?>? {
      val fnPtr = _1619612899_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandCellLte?>>()
      val hr = fn.invokeHR(arrayOf(__1619612899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MobileBroadbandCellLte?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_NeighboringCellsTdscdma(): IVectorView<MobileBroadbandCellTdscdma?>? {
      val fnPtr = _1619612899_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandCellTdscdma?>>()
      val hr = fn.invokeHR(arrayOf(__1619612899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<MobileBroadbandCellTdscdma?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_NeighboringCellsUmts(): IVectorView<MobileBroadbandCellUmts?>? {
      val fnPtr = _1619612899_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandCellUmts?>>()
      val hr = fn.invokeHR(arrayOf(__1619612899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MobileBroadbandCellUmts?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ServingCellsCdma(): IVectorView<MobileBroadbandCellCdma?>? {
      val fnPtr = _1619612899_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandCellCdma?>>()
      val hr = fn.invokeHR(arrayOf(__1619612899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MobileBroadbandCellCdma?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ServingCellsGsm(): IVectorView<MobileBroadbandCellGsm?>? {
      val fnPtr = _1619612899_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandCellGsm?>>()
      val hr = fn.invokeHR(arrayOf(__1619612899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MobileBroadbandCellGsm?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ServingCellsLte(): IVectorView<MobileBroadbandCellLte?>? {
      val fnPtr = _1619612899_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandCellLte?>>()
      val hr = fn.invokeHR(arrayOf(__1619612899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MobileBroadbandCellLte?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ServingCellsTdscdma(): IVectorView<MobileBroadbandCellTdscdma?>? {
      val fnPtr = _1619612899_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandCellTdscdma?>>()
      val hr = fn.invokeHR(arrayOf(__1619612899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<MobileBroadbandCellTdscdma?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_ServingCellsUmts(): IVectorView<MobileBroadbandCellUmts?>? {
      val fnPtr = _1619612899_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandCellUmts?>>()
      val hr = fn.invokeHR(arrayOf(__1619612899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MobileBroadbandCellUmts?>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandCellsInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1619612899_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandCellsInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("89a9562ae4724da5929cde61711dd261")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandCellsInfo(ptr: Pointer?): WithDefault =
        IMobileBroadbandCellsInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandCellsInfo {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandCellsInfo(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandCellsInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1619612899_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandCellsInfo):
        Array<IMobileBroadbandCellsInfo?> = (elements as
        Array<IMobileBroadbandCellsInfo?>).castToImpl<IMobileBroadbandCellsInfo,IMobileBroadbandCellsInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandCellsInfo?> =
        arrayOfNulls<IMobileBroadbandCellsInfo_Impl>(size) as Array<IMobileBroadbandCellsInfo?>
  }
}
