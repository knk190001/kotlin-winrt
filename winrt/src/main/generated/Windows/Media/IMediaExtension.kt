package Windows.Media

import Windows.Foundation.Collections.IPropertySet
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

@ABIMarker(IMediaExtension.ABI::class)
@Signature("{07915118-45df-442b-8a3f-f7826a6370ab}")
@Guid("0791511845df442b8a3ff7826a6370ab")
@WinRTInterface("0791511845df442b8a3ff7826a6370ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaExtension.ByReference::class)
public interface IMediaExtension : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetProperties(configuration: IPropertySet?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaExtension> {
    public override fun getValue() = ABI.makeIMediaExtension(pointer.getPointer(0))

    public fun setValue(value: IMediaExtension_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaExtension {
    public val __9720779_Ptr: Pointer?

    public val _9720779_VtblPtr: Pointer?
      get() = __9720779_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetProperties(configuration: IPropertySet?): Unit {
      val fnPtr = _9720779_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__9720779_Ptr, marshalToNative(configuration),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaExtension_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __9720779_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaExtension, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0791511845df442b8a3ff7826a6370ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaExtension(ptr: Pointer?): WithDefault = IMediaExtension_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaExtension {
      val address = segment.toRawLongValue()
      return makeIMediaExtension(Pointer(address))
    }

    public override fun toNative(obj: IMediaExtension): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__9720779_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaExtension): Array<IMediaExtension?> = (elements as
        Array<IMediaExtension?>).castToImpl<IMediaExtension,IMediaExtension_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaExtension?> =
        arrayOfNulls<IMediaExtension_Impl>(size) as Array<IMediaExtension?>
  }
}
