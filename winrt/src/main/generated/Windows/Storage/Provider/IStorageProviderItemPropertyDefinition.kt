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

@ABIMarker(IStorageProviderItemPropertyDefinition.ABI::class)
@Signature("{c5b383bb-ff1f-4298-831e-ff1c08089690}")
@Guid("c5b383bbff1f4298831eff1c08089690")
@WinRTInterface("c5b383bbff1f4298831eff1c08089690")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderItemPropertyDefinition.ByReference::class)
public interface IStorageProviderItemPropertyDefinition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): Int

  @InterfaceMethod(1)
  public fun put_Id(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_DisplayNameResource(): String?

  @InterfaceMethod(3)
  public fun put_DisplayNameResource(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderItemPropertyDefinition> {
    public override fun getValue() =
        ABI.makeIStorageProviderItemPropertyDefinition(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderItemPropertyDefinition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderItemPropertyDefinition {
    public val __1657233267_Ptr: Pointer?

    public val _1657233267_VtblPtr: Pointer?
      get() = __1657233267_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): Int {
      val fnPtr = _1657233267_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1657233267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Id(value: Int): Unit {
      val fnPtr = _1657233267_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1657233267_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DisplayNameResource(): String? {
      val fnPtr = _1657233267_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1657233267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DisplayNameResource(value: String?): Unit {
      val fnPtr = _1657233267_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1657233267_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorageProviderItemPropertyDefinition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1657233267_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderItemPropertyDefinition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c5b383bbff1f4298831eff1c08089690")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderItemPropertyDefinition(ptr: Pointer?): WithDefault =
        IStorageProviderItemPropertyDefinition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderItemPropertyDefinition {
      val address = segment.toRawLongValue()
      return makeIStorageProviderItemPropertyDefinition(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderItemPropertyDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1657233267_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderItemPropertyDefinition):
        Array<IStorageProviderItemPropertyDefinition?> = (elements as
        Array<IStorageProviderItemPropertyDefinition?>).castToImpl<IStorageProviderItemPropertyDefinition,IStorageProviderItemPropertyDefinition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderItemPropertyDefinition?> =
        arrayOfNulls<IStorageProviderItemPropertyDefinition_Impl>(size) as
        Array<IStorageProviderItemPropertyDefinition?>
  }
}
