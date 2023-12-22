package Microsoft.UI.Xaml.Controls.Primitives

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICornerRadiusFilterConverter.ABI::class)
@Signature("{6f1a3ed2-f965-545e-bd44-441db1794f5f}")
@Guid("6f1a3ed2f965545ebd44441db1794f5f")
@WinRTInterface("6f1a3ed2f965545ebd44441db1794f5f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICornerRadiusFilterConverter.ByReference::class)
public interface ICornerRadiusFilterConverter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Filter(): CornerRadiusFilterKind?

  @InterfaceMethod(1)
  public fun put_Filter(value: CornerRadiusFilterKind?): Unit

  @InterfaceMethod(2)
  public fun get_Scale(): Double

  @InterfaceMethod(3)
  public fun put_Scale(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICornerRadiusFilterConverter> {
    public override fun getValue() = ABI.makeICornerRadiusFilterConverter(pointer.getPointer(0))

    public fun setValue(value: ICornerRadiusFilterConverter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICornerRadiusFilterConverter {
    public val __1898173392_Ptr: Pointer?

    public val _1898173392_VtblPtr: Pointer?
      get() = __1898173392_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Filter(): CornerRadiusFilterKind? {
      val fnPtr = _1898173392_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CornerRadiusFilterKind>()
      val hr = fn.invokeHR(arrayOf(__1898173392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CornerRadiusFilterKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Filter(value: CornerRadiusFilterKind?): Unit {
      val fnPtr = _1898173392_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1898173392_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Scale(): Double {
      val fnPtr = _1898173392_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1898173392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Scale(value: Double): Unit {
      val fnPtr = _1898173392_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1898173392_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICornerRadiusFilterConverter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1898173392_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICornerRadiusFilterConverter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f1a3ed2f965545ebd44441db1794f5f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICornerRadiusFilterConverter(ptr: Pointer?): WithDefault =
        ICornerRadiusFilterConverter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICornerRadiusFilterConverter {
      val address = segment.toRawLongValue()
      return makeICornerRadiusFilterConverter(Pointer(address))
    }

    public override fun toNative(obj: ICornerRadiusFilterConverter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1898173392_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICornerRadiusFilterConverter):
        Array<ICornerRadiusFilterConverter?> = (elements as
        Array<ICornerRadiusFilterConverter?>).castToImpl<ICornerRadiusFilterConverter,ICornerRadiusFilterConverter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICornerRadiusFilterConverter?> =
        arrayOfNulls<ICornerRadiusFilterConverter_Impl>(size) as
        Array<ICornerRadiusFilterConverter?>
  }
}
