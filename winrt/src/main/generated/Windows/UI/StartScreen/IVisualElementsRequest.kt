package Windows.UI.StartScreen

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
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

@ABIMarker(IVisualElementsRequest.ABI::class)
@Signature("{c138333a-9308-4072-88cc-d068db347c68}")
@Guid("c138333a9308407288ccd068db347c68")
@WinRTInterface("c138333a9308407288ccd068db347c68")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualElementsRequest.ByReference::class)
public interface IVisualElementsRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VisualElements(): SecondaryTileVisualElements?

  @InterfaceMethod(1)
  public fun get_AlternateVisualElements(): IVectorView<SecondaryTileVisualElements?>?

  @InterfaceMethod(2)
  public fun get_Deadline(): DateTime?

  @InterfaceMethod(3)
  public fun GetDeferral(): VisualElementsRequestDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualElementsRequest> {
    public override fun getValue() = ABI.makeIVisualElementsRequest(pointer.getPointer(0))

    public fun setValue(value: IVisualElementsRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualElementsRequest {
    public val __1559419406_Ptr: Pointer?

    public val _1559419406_VtblPtr: Pointer?
      get() = __1559419406_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VisualElements(): SecondaryTileVisualElements? {
      val fnPtr = _1559419406_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SecondaryTileVisualElements>()
      val hr = fn.invokeHR(arrayOf(__1559419406_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SecondaryTileVisualElements>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AlternateVisualElements(): IVectorView<SecondaryTileVisualElements?>? {
      val fnPtr = _1559419406_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SecondaryTileVisualElements?>>()
      val hr = fn.invokeHR(arrayOf(__1559419406_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<SecondaryTileVisualElements?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Deadline(): DateTime? {
      val fnPtr = _1559419406_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1559419406_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDeferral(): VisualElementsRequestDeferral? {
      val fnPtr = _1559419406_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VisualElementsRequestDeferral>()
      val hr = fn.invokeHR(arrayOf(__1559419406_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VisualElementsRequestDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IVisualElementsRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1559419406_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualElementsRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c138333a9308407288ccd068db347c68")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualElementsRequest(ptr: Pointer?): WithDefault =
        IVisualElementsRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualElementsRequest {
      val address = segment.toRawLongValue()
      return makeIVisualElementsRequest(Pointer(address))
    }

    public override fun toNative(obj: IVisualElementsRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1559419406_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualElementsRequest): Array<IVisualElementsRequest?> =
        (elements as
        Array<IVisualElementsRequest?>).castToImpl<IVisualElementsRequest,IVisualElementsRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualElementsRequest?> =
        arrayOfNulls<IVisualElementsRequest_Impl>(size) as Array<IVisualElementsRequest?>
  }
}
