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

@ABIMarker(IPipsPagerStatics.ABI::class)
@Signature("{37714cd8-fba6-5d98-a395-0a7a3ea64867}")
@Guid("37714cd8fba65d98a3950a7a3ea64867")
@WinRTInterface("37714cd8fba65d98a3950a7a3ea64867")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPipsPagerStatics.ByReference::class)
public interface IPipsPagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NumberOfPagesProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_SelectedPageIndexProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_MaxVisiblePipsProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_OrientationProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_PreviousButtonVisibilityProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_NextButtonVisibilityProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_PreviousButtonStyleProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_NextButtonStyleProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_SelectedPipStyleProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_NormalPipStyleProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPipsPagerStatics> {
    public override fun getValue() = ABI.makeIPipsPagerStatics(pointer.getPointer(0))

    public fun setValue(value: IPipsPagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPipsPagerStatics {
    public val __1276153307_Ptr: Pointer?

    public val _1276153307_VtblPtr: Pointer?
      get() = __1276153307_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NumberOfPagesProperty(): DependencyProperty? {
      val fnPtr = _1276153307_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1276153307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SelectedPageIndexProperty(): DependencyProperty? {
      val fnPtr = _1276153307_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1276153307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MaxVisiblePipsProperty(): DependencyProperty? {
      val fnPtr = _1276153307_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1276153307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_OrientationProperty(): DependencyProperty? {
      val fnPtr = _1276153307_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1276153307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PreviousButtonVisibilityProperty(): DependencyProperty? {
      val fnPtr = _1276153307_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1276153307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_NextButtonVisibilityProperty(): DependencyProperty? {
      val fnPtr = _1276153307_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1276153307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_PreviousButtonStyleProperty(): DependencyProperty? {
      val fnPtr = _1276153307_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1276153307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_NextButtonStyleProperty(): DependencyProperty? {
      val fnPtr = _1276153307_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1276153307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_SelectedPipStyleProperty(): DependencyProperty? {
      val fnPtr = _1276153307_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1276153307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_NormalPipStyleProperty(): DependencyProperty? {
      val fnPtr = _1276153307_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1276153307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPipsPagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1276153307_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPipsPagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("37714cd8fba65d98a3950a7a3ea64867")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPipsPagerStatics(ptr: Pointer?): WithDefault = IPipsPagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPipsPagerStatics {
      val address = segment.toRawLongValue()
      return makeIPipsPagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPipsPagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1276153307_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPipsPagerStatics): Array<IPipsPagerStatics?> = (elements
        as Array<IPipsPagerStatics?>).castToImpl<IPipsPagerStatics,IPipsPagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPipsPagerStatics?> =
        arrayOfNulls<IPipsPagerStatics_Impl>(size) as Array<IPipsPagerStatics?>
  }
}
