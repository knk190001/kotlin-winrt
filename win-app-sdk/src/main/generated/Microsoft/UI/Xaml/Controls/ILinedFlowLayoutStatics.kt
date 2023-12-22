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

@ABIMarker(ILinedFlowLayoutStatics.ABI::class)
@Signature("{e5ed0928-228f-5a4e-8011-bd9cda24dca2}")
@Guid("e5ed0928228f5a4e8011bd9cda24dca2")
@WinRTInterface("e5ed0928228f5a4e8011bd9cda24dca2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILinedFlowLayoutStatics.ByReference::class)
public interface ILinedFlowLayoutStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemsJustificationProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ItemsStretchProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_MinItemSpacingProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_LineSpacingProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_LineHeightProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_ActualLineHeightProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILinedFlowLayoutStatics> {
    public override fun getValue() = ABI.makeILinedFlowLayoutStatics(pointer.getPointer(0))

    public fun setValue(value: ILinedFlowLayoutStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILinedFlowLayoutStatics {
    public val __352747556_Ptr: Pointer?

    public val _352747556_VtblPtr: Pointer?
      get() = __352747556_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemsJustificationProperty(): DependencyProperty? {
      val fnPtr = _352747556_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__352747556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ItemsStretchProperty(): DependencyProperty? {
      val fnPtr = _352747556_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__352747556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MinItemSpacingProperty(): DependencyProperty? {
      val fnPtr = _352747556_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__352747556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_LineSpacingProperty(): DependencyProperty? {
      val fnPtr = _352747556_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__352747556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_LineHeightProperty(): DependencyProperty? {
      val fnPtr = _352747556_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__352747556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ActualLineHeightProperty(): DependencyProperty? {
      val fnPtr = _352747556_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__352747556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ILinedFlowLayoutStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __352747556_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILinedFlowLayoutStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5ed0928228f5a4e8011bd9cda24dca2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILinedFlowLayoutStatics(ptr: Pointer?): WithDefault =
        ILinedFlowLayoutStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILinedFlowLayoutStatics {
      val address = segment.toRawLongValue()
      return makeILinedFlowLayoutStatics(Pointer(address))
    }

    public override fun toNative(obj: ILinedFlowLayoutStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__352747556_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILinedFlowLayoutStatics): Array<ILinedFlowLayoutStatics?>
        = (elements as
        Array<ILinedFlowLayoutStatics?>).castToImpl<ILinedFlowLayoutStatics,ILinedFlowLayoutStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILinedFlowLayoutStatics?> =
        arrayOfNulls<ILinedFlowLayoutStatics_Impl>(size) as Array<ILinedFlowLayoutStatics?>
  }
}
