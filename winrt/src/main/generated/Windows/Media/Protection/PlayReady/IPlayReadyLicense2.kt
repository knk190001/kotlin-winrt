package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.PlayReady.IPlayReadyLicense.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IPlayReadyLicense2.ABI::class)
@Signature("{30f4e7a7-d8e3-48a0-bcda-ff9f40530436}")
@Guid("30f4e7a7d8e348a0bcdaff9f40530436")
@WinRTInterface("30f4e7a7d8e348a0bcdaff9f40530436")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyLicense2.ByReference::class)
public interface IPlayReadyLicense2 : NativeMapped, IWinRTInterface, IPlayReadyLicense {
  @InterfaceMethod(0)
  public fun get_SecureStopId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_SecurityLevel(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_InMemoryOnly(): Boolean

  @InterfaceMethod(3)
  public fun get_ExpiresInRealTime(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyLicense2> {
    public override fun getValue() = ABI.makeIPlayReadyLicense2(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyLicense2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyLicense2, IPlayReadyLicense.WithDefault {
    public val __130454854_Ptr: Pointer?

    public val _130454854_VtblPtr: Pointer?
      get() = __130454854_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SecureStopId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _130454854_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__130454854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SecurityLevel(): WinDef.UINT {
      val fnPtr = _130454854_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__130454854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_InMemoryOnly(): Boolean {
      val fnPtr = _130454854_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__130454854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ExpiresInRealTime(): Boolean {
      val fnPtr = _130454854_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__130454854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPlayReadyLicense2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPlayReadyLicense {
    public override val __558397548_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_130454854_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __130454854_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyLicense2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30f4e7a7d8e348a0bcdaff9f40530436")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyLicense2(ptr: Pointer?): WithDefault = IPlayReadyLicense2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyLicense2 {
      val address = segment.toRawLongValue()
      return makeIPlayReadyLicense2(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyLicense2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__130454854_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyLicense2): Array<IPlayReadyLicense2?> =
        (elements as
        Array<IPlayReadyLicense2?>).castToImpl<IPlayReadyLicense2,IPlayReadyLicense2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyLicense2?> =
        arrayOfNulls<IPlayReadyLicense2_Impl>(size) as Array<IPlayReadyLicense2?>
  }
}
