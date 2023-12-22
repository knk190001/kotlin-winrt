package Windows.UI.Xaml.Shapes

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IShapeStatics.ABI::class)
@Signature("{1d7b4c55-9df3-48dc-9194-9d306faa6089}")
@Guid("1d7b4c559df348dc91949d306faa6089")
@WinRTInterface("1d7b4c559df348dc91949d306faa6089")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShapeStatics.ByReference::class)
public interface IShapeStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FillProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_StrokeProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_StrokeMiterLimitProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_StrokeThicknessProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_StrokeStartLineCapProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_StrokeEndLineCapProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_StrokeLineJoinProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_StrokeDashOffsetProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_StrokeDashCapProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_StrokeDashArrayProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_StretchProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IShapeStatics>
      {
    public override fun getValue() = ABI.makeIShapeStatics(pointer.getPointer(0))

    public fun setValue(value: IShapeStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShapeStatics {
    public val __757871484_Ptr: Pointer?

    public val _757871484_VtblPtr: Pointer?
      get() = __757871484_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FillProperty(): DependencyProperty? {
      val fnPtr = _757871484_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__757871484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StrokeProperty(): DependencyProperty? {
      val fnPtr = _757871484_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__757871484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_StrokeMiterLimitProperty(): DependencyProperty? {
      val fnPtr = _757871484_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__757871484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_StrokeThicknessProperty(): DependencyProperty? {
      val fnPtr = _757871484_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__757871484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_StrokeStartLineCapProperty(): DependencyProperty? {
      val fnPtr = _757871484_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__757871484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_StrokeEndLineCapProperty(): DependencyProperty? {
      val fnPtr = _757871484_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__757871484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_StrokeLineJoinProperty(): DependencyProperty? {
      val fnPtr = _757871484_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__757871484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_StrokeDashOffsetProperty(): DependencyProperty? {
      val fnPtr = _757871484_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__757871484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_StrokeDashCapProperty(): DependencyProperty? {
      val fnPtr = _757871484_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__757871484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_StrokeDashArrayProperty(): DependencyProperty? {
      val fnPtr = _757871484_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__757871484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_StretchProperty(): DependencyProperty? {
      val fnPtr = _757871484_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__757871484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IShapeStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __757871484_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShapeStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d7b4c559df348dc91949d306faa6089")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShapeStatics(ptr: Pointer?): WithDefault = IShapeStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShapeStatics {
      val address = segment.toRawLongValue()
      return makeIShapeStatics(Pointer(address))
    }

    public override fun toNative(obj: IShapeStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__757871484_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShapeStatics): Array<IShapeStatics?> = (elements as
        Array<IShapeStatics?>).castToImpl<IShapeStatics,IShapeStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShapeStatics?> =
        arrayOfNulls<IShapeStatics_Impl>(size) as Array<IShapeStatics?>
  }
}
