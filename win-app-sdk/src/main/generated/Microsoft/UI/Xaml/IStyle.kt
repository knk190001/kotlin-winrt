package Microsoft.UI.Xaml

import Windows.UI.Xaml.Interop.TypeName
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStyle.ABI::class)
@Signature("{65e1d164-572f-5b0e-a80f-9c02441fac49}")
@Guid("65e1d164572f5b0ea80f9c02441fac49")
@WinRTInterface("65e1d164572f5b0ea80f9c02441fac49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStyle.ByReference::class)
public interface IStyle : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSealed(): Boolean

  @InterfaceMethod(1)
  public fun get_Setters(): SetterBaseCollection?

  @InterfaceMethod(2)
  public fun get_TargetType(): TypeName?

  @InterfaceMethod(3)
  public fun put_TargetType(value: TypeName?): Unit

  @InterfaceMethod(4)
  public fun get_BasedOn(): Style?

  @InterfaceMethod(5)
  public fun put_BasedOn(value: Style?): Unit

  @InterfaceMethod(6)
  public fun Seal(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStyle> {
    public override fun getValue() = ABI.makeIStyle(pointer.getPointer(0))

    public fun setValue(value: IStyle_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStyle {
    public val __2101049802_Ptr: Pointer?

    public val _2101049802_VtblPtr: Pointer?
      get() = __2101049802_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSealed(): Boolean {
      val fnPtr = _2101049802_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2101049802_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Setters(): SetterBaseCollection? {
      val fnPtr = _2101049802_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SetterBaseCollection>()
      val hr = fn.invokeHR(arrayOf(__2101049802_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SetterBaseCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TargetType(): TypeName? {
      val fnPtr = _2101049802_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TypeName>()
      val hr = fn.invokeHR(arrayOf(__2101049802_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TypeName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TargetType(value: TypeName?): Unit {
      val fnPtr = _2101049802_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2101049802_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_BasedOn(): Style? {
      val fnPtr = _2101049802_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__2101049802_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_BasedOn(value: Style?): Unit {
      val fnPtr = _2101049802_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2101049802_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Seal(): Unit {
      val fnPtr = _2101049802_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2101049802_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStyle_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2101049802_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStyle, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("65e1d164572f5b0ea80f9c02441fac49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStyle(ptr: Pointer?): WithDefault = IStyle_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStyle {
      val address = segment.toRawLongValue()
      return makeIStyle(Pointer(address))
    }

    public override fun toNative(obj: IStyle): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2101049802_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStyle): Array<IStyle?> = (elements as
        Array<IStyle?>).castToImpl<IStyle,IStyle_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStyle?> = arrayOfNulls<IStyle_Impl>(size) as
        Array<IStyle?>
  }
}
