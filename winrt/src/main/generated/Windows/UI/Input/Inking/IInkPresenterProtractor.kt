package Windows.UI.Input.Inking

import Windows.UI.Color
import Windows.UI.Input.Inking.IInkPresenterStencil.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkPresenterProtractor.ABI::class)
@Signature("{7de3f2aa-ef6c-4e91-a73b-5b70d56fbd17}")
@Guid("7de3f2aaef6c4e91a73b5b70d56fbd17")
@WinRTInterface("7de3f2aaef6c4e91a73b5b70d56fbd17")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkPresenterProtractor.ByReference::class)
public interface IInkPresenterProtractor : NativeMapped, IWinRTInterface, IInkPresenterStencil {
  @InterfaceMethod(0)
  public fun get_AreTickMarksVisible(): Boolean

  @InterfaceMethod(1)
  public fun put_AreTickMarksVisible(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_AreRaysVisible(): Boolean

  @InterfaceMethod(3)
  public fun put_AreRaysVisible(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_IsCenterMarkerVisible(): Boolean

  @InterfaceMethod(5)
  public fun put_IsCenterMarkerVisible(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsAngleReadoutVisible(): Boolean

  @InterfaceMethod(7)
  public fun put_IsAngleReadoutVisible(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_IsResizable(): Boolean

  @InterfaceMethod(9)
  public fun put_IsResizable(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_Radius(): Double

  @InterfaceMethod(11)
  public fun put_Radius(value: Double): Unit

  @InterfaceMethod(12)
  public fun get_AccentColor(): Color?

  @InterfaceMethod(13)
  public fun put_AccentColor(value: Color?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkPresenterProtractor> {
    public override fun getValue() = ABI.makeIInkPresenterProtractor(pointer.getPointer(0))

    public fun setValue(value: IInkPresenterProtractor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkPresenterProtractor, IInkPresenterStencil.WithDefault {
    public val __743009274_Ptr: Pointer?

    public val _743009274_VtblPtr: Pointer?
      get() = __743009274_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreTickMarksVisible(): Boolean {
      val fnPtr = _743009274_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__743009274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AreTickMarksVisible(value: Boolean): Unit {
      val fnPtr = _743009274_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__743009274_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AreRaysVisible(): Boolean {
      val fnPtr = _743009274_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__743009274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_AreRaysVisible(value: Boolean): Unit {
      val fnPtr = _743009274_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__743009274_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsCenterMarkerVisible(): Boolean {
      val fnPtr = _743009274_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__743009274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsCenterMarkerVisible(value: Boolean): Unit {
      val fnPtr = _743009274_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__743009274_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsAngleReadoutVisible(): Boolean {
      val fnPtr = _743009274_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__743009274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsAngleReadoutVisible(value: Boolean): Unit {
      val fnPtr = _743009274_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__743009274_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsResizable(): Boolean {
      val fnPtr = _743009274_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__743009274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsResizable(value: Boolean): Unit {
      val fnPtr = _743009274_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__743009274_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Radius(): Double {
      val fnPtr = _743009274_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__743009274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_Radius(value: Double): Unit {
      val fnPtr = _743009274_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__743009274_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_AccentColor(): Color? {
      val fnPtr = _743009274_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__743009274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_AccentColor(value: Color?): Unit {
      val fnPtr = _743009274_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__743009274_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkPresenterProtractor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IInkPresenterStencil {
    public override val __516770336_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_743009274_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __743009274_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkPresenterProtractor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7de3f2aaef6c4e91a73b5b70d56fbd17")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkPresenterProtractor(ptr: Pointer?): WithDefault =
        IInkPresenterProtractor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkPresenterProtractor {
      val address = segment.toRawLongValue()
      return makeIInkPresenterProtractor(Pointer(address))
    }

    public override fun toNative(obj: IInkPresenterProtractor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__743009274_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkPresenterProtractor): Array<IInkPresenterProtractor?>
        = (elements as
        Array<IInkPresenterProtractor?>).castToImpl<IInkPresenterProtractor,IInkPresenterProtractor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkPresenterProtractor?> =
        arrayOfNulls<IInkPresenterProtractor_Impl>(size) as Array<IInkPresenterProtractor?>
  }
}
