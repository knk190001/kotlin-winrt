package Windows.UI.Xaml.Media

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

@ABIMarker(IPolyLineSegment.ABI::class)
@Signature("{4b397f87-a2e6-479d-bdc8-6f4464646887}")
@Guid("4b397f87a2e6479dbdc86f4464646887")
@WinRTInterface("4b397f87a2e6479dbdc86f4464646887")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPolyLineSegment.ByReference::class)
public interface IPolyLineSegment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Points(): PointCollection?

  @InterfaceMethod(1)
  public fun put_Points(value: PointCollection?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPolyLineSegment> {
    public override fun getValue() = ABI.makeIPolyLineSegment(pointer.getPointer(0))

    public fun setValue(value: IPolyLineSegment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPolyLineSegment {
    public val __984882103_Ptr: Pointer?

    public val _984882103_VtblPtr: Pointer?
      get() = __984882103_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Points(): PointCollection? {
      val fnPtr = _984882103_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointCollection>()
      val hr = fn.invokeHR(arrayOf(__984882103_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Points(value: PointCollection?): Unit {
      val fnPtr = _984882103_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__984882103_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPolyLineSegment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __984882103_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPolyLineSegment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4b397f87a2e6479dbdc86f4464646887")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPolyLineSegment(ptr: Pointer?): WithDefault = IPolyLineSegment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPolyLineSegment {
      val address = segment.toRawLongValue()
      return makeIPolyLineSegment(Pointer(address))
    }

    public override fun toNative(obj: IPolyLineSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__984882103_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPolyLineSegment): Array<IPolyLineSegment?> = (elements as
        Array<IPolyLineSegment?>).castToImpl<IPolyLineSegment,IPolyLineSegment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPolyLineSegment?> =
        arrayOfNulls<IPolyLineSegment_Impl>(size) as Array<IPolyLineSegment?>
  }
}
