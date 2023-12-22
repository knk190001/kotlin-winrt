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

@ABIMarker(IMenuBarStatics.ABI::class)
@Signature("{79aa0b84-5554-5f7c-80d9-7970aa030125}")
@Guid("79aa0b8455545f7c80d97970aa030125")
@WinRTInterface("79aa0b8455545f7c80d97970aa030125")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuBarStatics.ByReference::class)
public interface IMenuBarStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuBarStatics> {
    public override fun getValue() = ABI.makeIMenuBarStatics(pointer.getPointer(0))

    public fun setValue(value: IMenuBarStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuBarStatics {
    public val __638608264_Ptr: Pointer?

    public val _638608264_VtblPtr: Pointer?
      get() = __638608264_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemsProperty(): DependencyProperty? {
      val fnPtr = _638608264_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__638608264_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMenuBarStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __638608264_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuBarStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79aa0b8455545f7c80d97970aa030125")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuBarStatics(ptr: Pointer?): WithDefault = IMenuBarStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuBarStatics {
      val address = segment.toRawLongValue()
      return makeIMenuBarStatics(Pointer(address))
    }

    public override fun toNative(obj: IMenuBarStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__638608264_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuBarStatics): Array<IMenuBarStatics?> = (elements as
        Array<IMenuBarStatics?>).castToImpl<IMenuBarStatics,IMenuBarStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuBarStatics?> =
        arrayOfNulls<IMenuBarStatics_Impl>(size) as Array<IMenuBarStatics?>
  }
}
