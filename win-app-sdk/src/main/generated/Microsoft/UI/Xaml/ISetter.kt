package Microsoft.UI.Xaml

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ISetter.ABI::class)
@Signature("{bbd6074d-686f-5ae1-b8de-5f16aa30b80a}")
@Guid("bbd6074d686f5ae1b8de5f16aa30b80a")
@WinRTInterface("bbd6074d686f5ae1b8de5f16aa30b80a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISetter.ByReference::class)
public interface ISetter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Property(): DependencyProperty?

  @InterfaceMethod(1)
  public fun put_Property(value: DependencyProperty?): Unit

  @InterfaceMethod(2)
  public fun get_Value(): IUnknown?

  @InterfaceMethod(3)
  public fun put_Value(value: IUnknown?): Unit

  @InterfaceMethod(4)
  public fun get_Target(): TargetPropertyPath?

  @InterfaceMethod(5)
  public fun put_Target(value: TargetPropertyPath?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISetter> {
    public override fun getValue() = ABI.makeISetter(pointer.getPointer(0))

    public fun setValue(value: ISetter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISetter {
    public val __694040454_Ptr: Pointer?

    public val _694040454_VtblPtr: Pointer?
      get() = __694040454_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Property(): DependencyProperty? {
      val fnPtr = _694040454_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__694040454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Property(value: DependencyProperty?): Unit {
      val fnPtr = _694040454_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__694040454_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Value(): IUnknown? {
      val fnPtr = _694040454_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__694040454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Value(value: IUnknown?): Unit {
      val fnPtr = _694040454_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__694040454_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Target(): TargetPropertyPath? {
      val fnPtr = _694040454_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetPropertyPath>()
      val hr = fn.invokeHR(arrayOf(__694040454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetPropertyPath>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Target(value: TargetPropertyPath?): Unit {
      val fnPtr = _694040454_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__694040454_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISetter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __694040454_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISetter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bbd6074d686f5ae1b8de5f16aa30b80a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISetter(ptr: Pointer?): WithDefault = ISetter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISetter {
      val address = segment.toRawLongValue()
      return makeISetter(Pointer(address))
    }

    public override fun toNative(obj: ISetter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__694040454_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISetter): Array<ISetter?> = (elements as
        Array<ISetter?>).castToImpl<ISetter,ISetter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISetter?> = arrayOfNulls<ISetter_Impl>(size) as
        Array<ISetter?>
  }
}
