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

@ABIMarker(IMobileBroadbandCellsInfo2.ABI::class)
@Signature("{66205912-b89f-4e12-bbb6-d5cf09a820ca}")
@Guid("66205912b89f4e12bbb6d5cf09a820ca")
@WinRTInterface("66205912b89f4e12bbb6d5cf09a820ca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandCellsInfo2.ByReference::class)
public interface IMobileBroadbandCellsInfo2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NeighboringCellsNR(): IVectorView<MobileBroadbandCellNR?>?

  @InterfaceMethod(1)
  public fun get_ServingCellsNR(): IVectorView<MobileBroadbandCellNR?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandCellsInfo2> {
    public override fun getValue() = ABI.makeIMobileBroadbandCellsInfo2(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandCellsInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandCellsInfo2 {
    public val __1331607633_Ptr: Pointer?

    public val _1331607633_VtblPtr: Pointer?
      get() = __1331607633_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NeighboringCellsNR(): IVectorView<MobileBroadbandCellNR?>? {
      val fnPtr = _1331607633_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandCellNR?>>()
      val hr = fn.invokeHR(arrayOf(__1331607633_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MobileBroadbandCellNR?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ServingCellsNR(): IVectorView<MobileBroadbandCellNR?>? {
      val fnPtr = _1331607633_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandCellNR?>>()
      val hr = fn.invokeHR(arrayOf(__1331607633_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MobileBroadbandCellNR?>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandCellsInfo2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1331607633_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandCellsInfo2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("66205912b89f4e12bbb6d5cf09a820ca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandCellsInfo2(ptr: Pointer?): WithDefault =
        IMobileBroadbandCellsInfo2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandCellsInfo2 {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandCellsInfo2(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandCellsInfo2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1331607633_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandCellsInfo2):
        Array<IMobileBroadbandCellsInfo2?> = (elements as
        Array<IMobileBroadbandCellsInfo2?>).castToImpl<IMobileBroadbandCellsInfo2,IMobileBroadbandCellsInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandCellsInfo2?> =
        arrayOfNulls<IMobileBroadbandCellsInfo2_Impl>(size) as Array<IMobileBroadbandCellsInfo2?>
  }
}
