package Windows.UI.Input.Inking

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkPresenterRuler.ABI::class)
@Signature("{6cda7d5a-dec7-4dd7-877a-2133f183d48a}")
@Guid("6cda7d5adec74dd7877a2133f183d48a")
@WinRTInterface("6cda7d5adec74dd7877a2133f183d48a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkPresenterRuler.ByReference::class)
public interface IInkPresenterRuler : NativeMapped, IWinRTInterface, IInkPresenterStencil {
  @InterfaceMethod(0)
  public fun get_Length(): Double

  @InterfaceMethod(1)
  public fun put_Length(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_Width(): Double

  @InterfaceMethod(3)
  public fun put_Width(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkPresenterRuler> {
    public override fun getValue() = ABI.makeIInkPresenterRuler(pointer.getPointer(0))

    public fun setValue(value: IInkPresenterRuler_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkPresenterRuler, IInkPresenterStencil.WithDefault {
    public val __1779118502_Ptr: Pointer?

    public val _1779118502_VtblPtr: Pointer?
      get() = __1779118502_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Length(): Double {
      val fnPtr = _1779118502_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1779118502_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Length(value: Double): Unit {
      val fnPtr = _1779118502_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1779118502_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Width(): Double {
      val fnPtr = _1779118502_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1779118502_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Width(value: Double): Unit {
      val fnPtr = _1779118502_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1779118502_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkPresenterRuler_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IInkPresenterStencil {
    public override val __516770336_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1779118502_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1779118502_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkPresenterRuler, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6cda7d5adec74dd7877a2133f183d48a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkPresenterRuler(ptr: Pointer?): WithDefault = IInkPresenterRuler_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkPresenterRuler {
      val address = segment.toRawLongValue()
      return makeIInkPresenterRuler(Pointer(address))
    }

    public override fun toNative(obj: IInkPresenterRuler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1779118502_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkPresenterRuler): Array<IInkPresenterRuler?> =
        (elements as
        Array<IInkPresenterRuler?>).castToImpl<IInkPresenterRuler,IInkPresenterRuler_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkPresenterRuler?> =
        arrayOfNulls<IInkPresenterRuler_Impl>(size) as Array<IInkPresenterRuler?>
  }
}
