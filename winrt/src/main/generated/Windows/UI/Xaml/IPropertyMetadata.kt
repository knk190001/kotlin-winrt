package Windows.UI.Xaml

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

@ABIMarker(IPropertyMetadata.ABI::class)
@Signature("{814ef30d-8d18-448a-8644-f2cb51e70380}")
@Guid("814ef30d8d18448a8644f2cb51e70380")
@WinRTInterface("814ef30d8d18448a8644f2cb51e70380")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPropertyMetadata.ByReference::class)
public interface IPropertyMetadata : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DefaultValue(): IUnknown?

  @InterfaceMethod(1)
  public fun get_CreateDefaultValueCallback(): CreateDefaultValueCallback?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPropertyMetadata> {
    public override fun getValue() = ABI.makeIPropertyMetadata(pointer.getPointer(0))

    public fun setValue(value: IPropertyMetadata_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPropertyMetadata {
    public val __1449261686_Ptr: Pointer?

    public val _1449261686_VtblPtr: Pointer?
      get() = __1449261686_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DefaultValue(): IUnknown? {
      val fnPtr = _1449261686_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1449261686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CreateDefaultValueCallback(): CreateDefaultValueCallback? {
      val fnPtr = _1449261686_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CreateDefaultValueCallback>()
      val hr = fn.invokeHR(arrayOf(__1449261686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CreateDefaultValueCallback>(result.getValue())
      return resultValue
    }
  }

  public class IPropertyMetadata_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1449261686_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPropertyMetadata, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("814ef30d8d18448a8644f2cb51e70380")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPropertyMetadata(ptr: Pointer?): WithDefault = IPropertyMetadata_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPropertyMetadata {
      val address = segment.toRawLongValue()
      return makeIPropertyMetadata(Pointer(address))
    }

    public override fun toNative(obj: IPropertyMetadata): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1449261686_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPropertyMetadata): Array<IPropertyMetadata?> = (elements
        as Array<IPropertyMetadata?>).castToImpl<IPropertyMetadata,IPropertyMetadata_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPropertyMetadata?> =
        arrayOfNulls<IPropertyMetadata_Impl>(size) as Array<IPropertyMetadata?>
  }
}
