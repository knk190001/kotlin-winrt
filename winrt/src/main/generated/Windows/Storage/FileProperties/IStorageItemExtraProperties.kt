package Windows.Storage.FileProperties

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMap
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageItemExtraProperties.ABI::class)
@Signature("{c54361b2-54cd-432b-bdbc-4b19c4b470d7}")
@Guid("c54361b254cd432bbdbc4b19c4b470d7")
@WinRTInterface("c54361b254cd432bbdbc4b19c4b470d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageItemExtraProperties.ByReference::class)
public interface IStorageItemExtraProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RetrievePropertiesAsync(propertiesToRetrieve: IIterable<String?>?):
      IAsyncOperation<IMap<String?, IUnknown?>?>?

  @InterfaceMethod(1)
  public fun SavePropertiesAsync(propertiesToSave: IIterable<IKeyValuePair<String?, IUnknown?>?>?):
      IAsyncAction?

  @InterfaceMethod(2)
  public fun SavePropertiesAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageItemExtraProperties> {
    public override fun getValue() = ABI.makeIStorageItemExtraProperties(pointer.getPointer(0))

    public fun setValue(value: IStorageItemExtraProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageItemExtraProperties {
    public val __1999536785_Ptr: Pointer?

    public val _1999536785_VtblPtr: Pointer?
      get() = __1999536785_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RetrievePropertiesAsync(propertiesToRetrieve: IIterable<String?>?):
        IAsyncOperation<IMap<String?, IUnknown?>?>? {
      val fnPtr = _1999536785_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IMap<String?, IUnknown?>?>>()
      val hr = fn.invokeHR(arrayOf(__1999536785_Ptr, marshalToNative(propertiesToRetrieve), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IMap<String?,
          IUnknown?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SavePropertiesAsync(propertiesToSave: IIterable<IKeyValuePair<String?,
        IUnknown?>?>?): IAsyncAction? {
      val fnPtr = _1999536785_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1999536785_Ptr, marshalToNative(propertiesToSave), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SavePropertiesAsync(): IAsyncAction? {
      val fnPtr = _1999536785_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1999536785_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IStorageItemExtraProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1999536785_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageItemExtraProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c54361b254cd432bbdbc4b19c4b470d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageItemExtraProperties(ptr: Pointer?): WithDefault =
        IStorageItemExtraProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageItemExtraProperties {
      val address = segment.toRawLongValue()
      return makeIStorageItemExtraProperties(Pointer(address))
    }

    public override fun toNative(obj: IStorageItemExtraProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1999536785_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItemExtraProperties):
        Array<IStorageItemExtraProperties?> = (elements as
        Array<IStorageItemExtraProperties?>).castToImpl<IStorageItemExtraProperties,IStorageItemExtraProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItemExtraProperties?> =
        arrayOfNulls<IStorageItemExtraProperties_Impl>(size) as Array<IStorageItemExtraProperties?>
  }
}
