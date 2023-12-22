package Windows.UI.Xaml.Controls

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

@ABIMarker(ISplitButtonStatics.ABI::class)
@Signature("{8df07a81-0b1f-5ea9-be42-152ab9a4bc5e}")
@Guid("8df07a810b1f5ea9be42152ab9a4bc5e")
@WinRTInterface("8df07a810b1f5ea9be42152ab9a4bc5e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitButtonStatics.ByReference::class)
public interface ISplitButtonStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FlyoutProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CommandProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_CommandParameterProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplitButtonStatics> {
    public override fun getValue() = ABI.makeISplitButtonStatics(pointer.getPointer(0))

    public fun setValue(value: ISplitButtonStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitButtonStatics {
    public val __102092885_Ptr: Pointer?

    public val _102092885_VtblPtr: Pointer?
      get() = __102092885_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FlyoutProperty(): DependencyProperty? {
      val fnPtr = _102092885_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__102092885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CommandProperty(): DependencyProperty? {
      val fnPtr = _102092885_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__102092885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CommandParameterProperty(): DependencyProperty? {
      val fnPtr = _102092885_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__102092885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISplitButtonStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __102092885_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitButtonStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8df07a810b1f5ea9be42152ab9a4bc5e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitButtonStatics(ptr: Pointer?): WithDefault = ISplitButtonStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitButtonStatics {
      val address = segment.toRawLongValue()
      return makeISplitButtonStatics(Pointer(address))
    }

    public override fun toNative(obj: ISplitButtonStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__102092885_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitButtonStatics): Array<ISplitButtonStatics?> =
        (elements as
        Array<ISplitButtonStatics?>).castToImpl<ISplitButtonStatics,ISplitButtonStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitButtonStatics?> =
        arrayOfNulls<ISplitButtonStatics_Impl>(size) as Array<ISplitButtonStatics?>
  }
}
