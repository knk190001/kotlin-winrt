package Windows.Storage.Provider

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageProviderItemProperty.ABI::class)
@Signature("{476cb558-730b-4188-b7b5-63b716ed476d}")
@Guid("476cb558730b4188b7b563b716ed476d")
@WinRTInterface("476cb558730b4188b7b563b716ed476d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderItemProperty.ByReference::class)
public interface IStorageProviderItemProperty : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Id(value: Int): Unit

  @InterfaceMethod(1)
  public fun get_Id(): Int

  @InterfaceMethod(2)
  public fun put_Value(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_Value(): String?

  @InterfaceMethod(4)
  public fun put_IconResource(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_IconResource(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderItemProperty> {
    public override fun getValue() = ABI.makeIStorageProviderItemProperty(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderItemProperty_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderItemProperty {
    public val __573126758_Ptr: Pointer?

    public val _573126758_VtblPtr: Pointer?
      get() = __573126758_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Id(value: Int): Unit {
      val fnPtr = _573126758_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__573126758_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Id(): Int {
      val fnPtr = _573126758_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__573126758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Value(value: String?): Unit {
      val fnPtr = _573126758_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__573126758_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Value(): String? {
      val fnPtr = _573126758_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__573126758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_IconResource(value: String?): Unit {
      val fnPtr = _573126758_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__573126758_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_IconResource(): String? {
      val fnPtr = _573126758_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__573126758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IStorageProviderItemProperty_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __573126758_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderItemProperty, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("476cb558730b4188b7b563b716ed476d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderItemProperty(ptr: Pointer?): WithDefault =
        IStorageProviderItemProperty_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderItemProperty {
      val address = segment.toRawLongValue()
      return makeIStorageProviderItemProperty(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderItemProperty): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__573126758_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderItemProperty):
        Array<IStorageProviderItemProperty?> = (elements as
        Array<IStorageProviderItemProperty?>).castToImpl<IStorageProviderItemProperty,IStorageProviderItemProperty_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderItemProperty?> =
        arrayOfNulls<IStorageProviderItemProperty_Impl>(size) as
        Array<IStorageProviderItemProperty?>
  }
}
