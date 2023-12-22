package Windows.Security.Credentials

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPasswordCredential.ABI::class)
@Signature("{6ab18989-c720-41a7-a6c1-feadb36329a0}")
@Guid("6ab18989c72041a7a6c1feadb36329a0")
@WinRTInterface("6ab18989c72041a7a6c1feadb36329a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPasswordCredential.ByReference::class)
public interface IPasswordCredential : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Resource(): String?

  @InterfaceMethod(1)
  public fun put_Resource(resource: String?): Unit

  @InterfaceMethod(2)
  public fun get_UserName(): String?

  @InterfaceMethod(3)
  public fun put_UserName(userName: String?): Unit

  @InterfaceMethod(4)
  public fun get_Password(): String?

  @InterfaceMethod(5)
  public fun put_Password(password: String?): Unit

  @InterfaceMethod(6)
  public fun RetrievePassword(): Unit

  @InterfaceMethod(7)
  public fun get_Properties(): IPropertySet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPasswordCredential> {
    public override fun getValue() = ABI.makeIPasswordCredential(pointer.getPointer(0))

    public fun setValue(value: IPasswordCredential_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPasswordCredential {
    public val __1463427870_Ptr: Pointer?

    public val _1463427870_VtblPtr: Pointer?
      get() = __1463427870_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Resource(): String? {
      val fnPtr = _1463427870_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1463427870_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Resource(resource: String?): Unit {
      val fnPtr = _1463427870_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1463427870_Ptr, marshalToNative(resource),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_UserName(): String? {
      val fnPtr = _1463427870_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1463427870_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_UserName(userName: String?): Unit {
      val fnPtr = _1463427870_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1463427870_Ptr, marshalToNative(userName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Password(): String? {
      val fnPtr = _1463427870_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1463427870_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Password(password: String?): Unit {
      val fnPtr = _1463427870_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1463427870_Ptr, marshalToNative(password),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun RetrievePassword(): Unit {
      val fnPtr = _1463427870_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1463427870_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Properties(): IPropertySet? {
      val fnPtr = _1463427870_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1463427870_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }
  }

  public class IPasswordCredential_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1463427870_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPasswordCredential, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6ab18989c72041a7a6c1feadb36329a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPasswordCredential(ptr: Pointer?): WithDefault = IPasswordCredential_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPasswordCredential {
      val address = segment.toRawLongValue()
      return makeIPasswordCredential(Pointer(address))
    }

    public override fun toNative(obj: IPasswordCredential): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1463427870_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPasswordCredential): Array<IPasswordCredential?> =
        (elements as
        Array<IPasswordCredential?>).castToImpl<IPasswordCredential,IPasswordCredential_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPasswordCredential?> =
        arrayOfNulls<IPasswordCredential_Impl>(size) as Array<IPasswordCredential?>
  }
}
