package Windows.Security.Cryptography.Core

import Windows.Storage.Streams.IBuffer
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICryptographicKey.ABI::class)
@Signature("{ed2a3b70-8e7b-4009-8401-ffd1a62eeb27}")
@Guid("ed2a3b708e7b40098401ffd1a62eeb27")
@WinRTInterface("ed2a3b708e7b40098401ffd1a62eeb27")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICryptographicKey.ByReference::class)
public interface ICryptographicKey : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeySize(): WinDef.UINT

  @InterfaceMethod(1)
  public fun Export(): IBuffer?

  @InterfaceMethod(2)
  public fun Export(BlobType: CryptographicPrivateKeyBlobType?): IBuffer?

  @InterfaceMethod(3)
  public fun ExportPublicKey(): IBuffer?

  @InterfaceMethod(4)
  public fun ExportPublicKey(BlobType: CryptographicPublicKeyBlobType?): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICryptographicKey> {
    public override fun getValue() = ABI.makeICryptographicKey(pointer.getPointer(0))

    public fun setValue(value: ICryptographicKey_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICryptographicKey {
    public val __1011511619_Ptr: Pointer?

    public val _1011511619_VtblPtr: Pointer?
      get() = __1011511619_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeySize(): WinDef.UINT {
      val fnPtr = _1011511619_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1011511619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun Export(): IBuffer? {
      val fnPtr = _1011511619_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1011511619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Export(BlobType: CryptographicPrivateKeyBlobType?): IBuffer? {
      val fnPtr = _1011511619_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1011511619_Ptr, marshalToNative(BlobType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ExportPublicKey(): IBuffer? {
      val fnPtr = _1011511619_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1011511619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ExportPublicKey(BlobType: CryptographicPublicKeyBlobType?): IBuffer? {
      val fnPtr = _1011511619_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1011511619_Ptr, marshalToNative(BlobType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class ICryptographicKey_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1011511619_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICryptographicKey, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed2a3b708e7b40098401ffd1a62eeb27")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICryptographicKey(ptr: Pointer?): WithDefault = ICryptographicKey_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICryptographicKey {
      val address = segment.toRawLongValue()
      return makeICryptographicKey(Pointer(address))
    }

    public override fun toNative(obj: ICryptographicKey): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1011511619_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICryptographicKey): Array<ICryptographicKey?> = (elements
        as Array<ICryptographicKey?>).castToImpl<ICryptographicKey,ICryptographicKey_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICryptographicKey?> =
        arrayOfNulls<ICryptographicKey_Impl>(size) as Array<ICryptographicKey?>
  }
}
