package Microsoft.UI.Xaml

import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IVector
import Windows.Foundation.Uri
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

@ABIMarker(IResourceDictionary.ABI::class)
@Signature("{1b690975-a710-5783-a6e1-15836f6186c2}")
@Guid("1b690975a7105783a6e115836f6186c2")
@WinRTInterface("1b690975a7105783a6e115836f6186c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceDictionary.ByReference::class)
public interface IResourceDictionary : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): Uri?

  @InterfaceMethod(1)
  public fun put_Source(value: Uri?): Unit

  @InterfaceMethod(2)
  public fun get_MergedDictionaries(): IVector<ResourceDictionary?>?

  @InterfaceMethod(3)
  public fun get_ThemeDictionaries(): IMap<IUnknown?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceDictionary> {
    public override fun getValue() = ABI.makeIResourceDictionary(pointer.getPointer(0))

    public fun setValue(value: IResourceDictionary_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceDictionary {
    public val __187542475_Ptr: Pointer?

    public val _187542475_VtblPtr: Pointer?
      get() = __187542475_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): Uri? {
      val fnPtr = _187542475_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__187542475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Source(value: Uri?): Unit {
      val fnPtr = _187542475_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__187542475_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MergedDictionaries(): IVector<ResourceDictionary?>? {
      val fnPtr = _187542475_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ResourceDictionary?>>()
      val hr = fn.invokeHR(arrayOf(__187542475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ResourceDictionary?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ThemeDictionaries(): IMap<IUnknown?, IUnknown?>? {
      val fnPtr = _187542475_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<IUnknown?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__187542475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<IUnknown?, IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IResourceDictionary_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __187542475_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceDictionary, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b690975a7105783a6e115836f6186c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceDictionary(ptr: Pointer?): WithDefault = IResourceDictionary_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceDictionary {
      val address = segment.toRawLongValue()
      return makeIResourceDictionary(Pointer(address))
    }

    public override fun toNative(obj: IResourceDictionary): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__187542475_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceDictionary): Array<IResourceDictionary?> =
        (elements as
        Array<IResourceDictionary?>).castToImpl<IResourceDictionary,IResourceDictionary_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceDictionary?> =
        arrayOfNulls<IResourceDictionary_Impl>(size) as Array<IResourceDictionary?>
  }
}
