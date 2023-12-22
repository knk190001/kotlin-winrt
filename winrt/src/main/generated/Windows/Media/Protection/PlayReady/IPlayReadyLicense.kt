package Windows.Media.Protection.PlayReady

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayReadyLicense.ABI::class)
@Signature("{ee474c4e-fa3c-414d-a9f2-3ffc1ef832d4}")
@Guid("ee474c4efa3c414da9f23ffc1ef832d4")
@WinRTInterface("ee474c4efa3c414da9f23ffc1ef832d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyLicense.ByReference::class)
public interface IPlayReadyLicense : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FullyEvaluated(): Boolean

  @InterfaceMethod(1)
  public fun get_UsableForPlay(): Boolean

  @InterfaceMethod(2)
  public fun get_ExpirationDate(): IReference<DateTime?>?

  @InterfaceMethod(3)
  public fun get_ExpireAfterFirstPlay(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_DomainAccountID(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(5)
  public fun get_ChainDepth(): WinDef.UINT

  @InterfaceMethod(6)
  public fun GetKIDAtChainDepth(chainDepth: WinDef.UINT): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyLicense> {
    public override fun getValue() = ABI.makeIPlayReadyLicense(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyLicense_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyLicense {
    public val __558397548_Ptr: Pointer?

    public val _558397548_VtblPtr: Pointer?
      get() = __558397548_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FullyEvaluated(): Boolean {
      val fnPtr = _558397548_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__558397548_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_UsableForPlay(): Boolean {
      val fnPtr = _558397548_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__558397548_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ExpirationDate(): IReference<DateTime?>? {
      val fnPtr = _558397548_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__558397548_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ExpireAfterFirstPlay(): WinDef.UINT {
      val fnPtr = _558397548_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__558397548_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_DomainAccountID(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _558397548_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__558397548_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ChainDepth(): WinDef.UINT {
      val fnPtr = _558397548_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__558397548_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun GetKIDAtChainDepth(chainDepth: WinDef.UINT):
        com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _558397548_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__558397548_Ptr, chainDepth, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IPlayReadyLicense_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __558397548_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyLicense, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee474c4efa3c414da9f23ffc1ef832d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyLicense(ptr: Pointer?): WithDefault = IPlayReadyLicense_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyLicense {
      val address = segment.toRawLongValue()
      return makeIPlayReadyLicense(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyLicense): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__558397548_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyLicense): Array<IPlayReadyLicense?> = (elements
        as Array<IPlayReadyLicense?>).castToImpl<IPlayReadyLicense,IPlayReadyLicense_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyLicense?> =
        arrayOfNulls<IPlayReadyLicense_Impl>(size) as Array<IPlayReadyLicense?>
  }
}
