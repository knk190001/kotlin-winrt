package Windows.Security.Credentials

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IPasswordVault.ABI::class)
@Signature("{61fd2c0b-c8d4-48c1-a54f-bc5a64205af2}")
@Guid("61fd2c0bc8d448c1a54fbc5a64205af2")
@WinRTInterface("61fd2c0bc8d448c1a54fbc5a64205af2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPasswordVault.ByReference::class)
public interface IPasswordVault : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Add(credential: PasswordCredential?): Unit

  @InterfaceMethod(1)
  public fun Remove(credential: PasswordCredential?): Unit

  @InterfaceMethod(2)
  public fun Retrieve(resource: String?, userName: String?): PasswordCredential?

  @InterfaceMethod(3)
  public fun FindAllByResource(resource: String?): IVectorView<PasswordCredential?>?

  @InterfaceMethod(4)
  public fun FindAllByUserName(userName: String?): IVectorView<PasswordCredential?>?

  @InterfaceMethod(5)
  public fun RetrieveAll(): IVectorView<PasswordCredential?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPasswordVault>
      {
    public override fun getValue() = ABI.makeIPasswordVault(pointer.getPointer(0))

    public fun setValue(value: IPasswordVault_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPasswordVault {
    public val __1660998343_Ptr: Pointer?

    public val _1660998343_VtblPtr: Pointer?
      get() = __1660998343_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Add(credential: PasswordCredential?): Unit {
      val fnPtr = _1660998343_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1660998343_Ptr, marshalToNative(credential),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Remove(credential: PasswordCredential?): Unit {
      val fnPtr = _1660998343_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1660998343_Ptr, marshalToNative(credential),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Retrieve(resource: String?, userName: String?): PasswordCredential? {
      val fnPtr = _1660998343_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordCredential>()
      val hr = fn.invokeHR(arrayOf(__1660998343_Ptr, marshalToNative(resource),
          marshalToNative(userName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordCredential>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FindAllByResource(resource: String?): IVectorView<PasswordCredential?>? {
      val fnPtr = _1660998343_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PasswordCredential?>>()
      val hr = fn.invokeHR(arrayOf(__1660998343_Ptr, marshalToNative(resource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PasswordCredential?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun FindAllByUserName(userName: String?): IVectorView<PasswordCredential?>? {
      val fnPtr = _1660998343_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PasswordCredential?>>()
      val hr = fn.invokeHR(arrayOf(__1660998343_Ptr, marshalToNative(userName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PasswordCredential?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun RetrieveAll(): IVectorView<PasswordCredential?>? {
      val fnPtr = _1660998343_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PasswordCredential?>>()
      val hr = fn.invokeHR(arrayOf(__1660998343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PasswordCredential?>>(result.getValue())
      return resultValue
    }
  }

  public class IPasswordVault_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1660998343_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPasswordVault, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61fd2c0bc8d448c1a54fbc5a64205af2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPasswordVault(ptr: Pointer?): WithDefault = IPasswordVault_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPasswordVault {
      val address = segment.toRawLongValue()
      return makeIPasswordVault(Pointer(address))
    }

    public override fun toNative(obj: IPasswordVault): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1660998343_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPasswordVault): Array<IPasswordVault?> = (elements as
        Array<IPasswordVault?>).castToImpl<IPasswordVault,IPasswordVault_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPasswordVault?> =
        arrayOfNulls<IPasswordVault_Impl>(size) as Array<IPasswordVault?>
  }
}
