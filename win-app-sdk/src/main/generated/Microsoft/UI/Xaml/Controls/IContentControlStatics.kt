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

@ABIMarker(IContentControlStatics.ABI::class)
@Signature("{f25484f4-2fed-5a0a-8864-7d6d4ac43ef8}")
@Guid("f25484f42fed5a0a88647d6d4ac43ef8")
@WinRTInterface("f25484f42fed5a0a88647d6d4ac43ef8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentControlStatics.ByReference::class)
public interface IContentControlStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ContentTemplateProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ContentTemplateSelectorProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_ContentTransitionsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentControlStatics> {
    public override fun getValue() = ABI.makeIContentControlStatics(pointer.getPointer(0))

    public fun setValue(value: IContentControlStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentControlStatics {
    public val __261455130_Ptr: Pointer?

    public val _261455130_VtblPtr: Pointer?
      get() = __261455130_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentProperty(): DependencyProperty? {
      val fnPtr = _261455130_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__261455130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ContentTemplateProperty(): DependencyProperty? {
      val fnPtr = _261455130_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__261455130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ContentTemplateSelectorProperty(): DependencyProperty? {
      val fnPtr = _261455130_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__261455130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ContentTransitionsProperty(): DependencyProperty? {
      val fnPtr = _261455130_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__261455130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IContentControlStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __261455130_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentControlStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f25484f42fed5a0a88647d6d4ac43ef8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentControlStatics(ptr: Pointer?): WithDefault =
        IContentControlStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentControlStatics {
      val address = segment.toRawLongValue()
      return makeIContentControlStatics(Pointer(address))
    }

    public override fun toNative(obj: IContentControlStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__261455130_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentControlStatics): Array<IContentControlStatics?> =
        (elements as
        Array<IContentControlStatics?>).castToImpl<IContentControlStatics,IContentControlStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentControlStatics?> =
        arrayOfNulls<IContentControlStatics_Impl>(size) as Array<IContentControlStatics?>
  }
}
