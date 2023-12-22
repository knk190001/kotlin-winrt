package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IToolTipStatics.ABI::class)
@Signature("{88eb60d4-cd54-5e23-bd1a-223702442ba4}")
@Guid("88eb60d4cd545e23bd1a223702442ba4")
@WinRTInterface("88eb60d4cd545e23bd1a223702442ba4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToolTipStatics.ByReference::class)
public interface IToolTipStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsOpenProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_PlacementProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_PlacementTargetProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_PlacementRectProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_VerticalOffsetProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToolTipStatics> {
    public override fun getValue() = ABI.makeIToolTipStatics(pointer.getPointer(0))

    public fun setValue(value: IToolTipStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToolTipStatics {
    public val __592498665_Ptr: Pointer?

    public val _592498665_VtblPtr: Pointer?
      get() = __592498665_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalOffsetProperty(): DependencyProperty? {
      val fnPtr = _592498665_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__592498665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsOpenProperty(): DependencyProperty? {
      val fnPtr = _592498665_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__592498665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PlacementProperty(): DependencyProperty? {
      val fnPtr = _592498665_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__592498665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PlacementTargetProperty(): DependencyProperty? {
      val fnPtr = _592498665_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__592498665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PlacementRectProperty(): DependencyProperty? {
      val fnPtr = _592498665_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__592498665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_VerticalOffsetProperty(): DependencyProperty? {
      val fnPtr = _592498665_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__592498665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IToolTipStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __592498665_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToolTipStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("88eb60d4cd545e23bd1a223702442ba4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToolTipStatics(ptr: Pointer?): WithDefault = IToolTipStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToolTipStatics {
      val address = segment.toRawLongValue()
      return makeIToolTipStatics(Pointer(address))
    }

    public override fun toNative(obj: IToolTipStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__592498665_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToolTipStatics): Array<IToolTipStatics?> = (elements as
        Array<IToolTipStatics?>).castToImpl<IToolTipStatics,IToolTipStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToolTipStatics?> =
        arrayOfNulls<IToolTipStatics_Impl>(size) as Array<IToolTipStatics?>
  }
}
