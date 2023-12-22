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

@ABIMarker(IColumnDefinitionStatics.ABI::class)
@Signature("{aba4b755-ca63-5ed7-ae31-45f9f91920b0}")
@Guid("aba4b755ca635ed7ae3145f9f91920b0")
@WinRTInterface("aba4b755ca635ed7ae3145f9f91920b0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColumnDefinitionStatics.ByReference::class)
public interface IColumnDefinitionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WidthProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_MaxWidthProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_MinWidthProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColumnDefinitionStatics> {
    public override fun getValue() = ABI.makeIColumnDefinitionStatics(pointer.getPointer(0))

    public fun setValue(value: IColumnDefinitionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColumnDefinitionStatics {
    public val __300332181_Ptr: Pointer?

    public val _300332181_VtblPtr: Pointer?
      get() = __300332181_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WidthProperty(): DependencyProperty? {
      val fnPtr = _300332181_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__300332181_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaxWidthProperty(): DependencyProperty? {
      val fnPtr = _300332181_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__300332181_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MinWidthProperty(): DependencyProperty? {
      val fnPtr = _300332181_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__300332181_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IColumnDefinitionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __300332181_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColumnDefinitionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aba4b755ca635ed7ae3145f9f91920b0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColumnDefinitionStatics(ptr: Pointer?): WithDefault =
        IColumnDefinitionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColumnDefinitionStatics {
      val address = segment.toRawLongValue()
      return makeIColumnDefinitionStatics(Pointer(address))
    }

    public override fun toNative(obj: IColumnDefinitionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__300332181_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColumnDefinitionStatics):
        Array<IColumnDefinitionStatics?> = (elements as
        Array<IColumnDefinitionStatics?>).castToImpl<IColumnDefinitionStatics,IColumnDefinitionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColumnDefinitionStatics?> =
        arrayOfNulls<IColumnDefinitionStatics_Impl>(size) as Array<IColumnDefinitionStatics?>
  }
}
