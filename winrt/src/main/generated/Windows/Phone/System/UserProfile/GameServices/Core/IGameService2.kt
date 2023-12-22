package Windows.Phone.System.UserProfile.GameServices.Core

import Windows.Foundation.Uri
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

@ABIMarker(IGameService2.ABI::class)
@Signature("{d2364ef6-ea17-4be5-8d8a-c860885e051f}")
@Guid("d2364ef6ea174be58d8ac860885e051f")
@WinRTInterface("d2364ef6ea174be58d8ac860885e051f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameService2.ByReference::class)
public interface IGameService2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun NotifyPartnerTokenExpired(audienceUri: Uri?): Unit

  @InterfaceMethod(1)
  public fun GetAuthenticationStatus(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGameService2>
      {
    public override fun getValue() = ABI.makeIGameService2(pointer.getPointer(0))

    public fun setValue(value: IGameService2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameService2 {
    public val __247858783_Ptr: Pointer?

    public val _247858783_VtblPtr: Pointer?
      get() = __247858783_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun NotifyPartnerTokenExpired(audienceUri: Uri?): Unit {
      val fnPtr = _247858783_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__247858783_Ptr, marshalToNative(audienceUri),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetAuthenticationStatus(): WinDef.UINT {
      val fnPtr = _247858783_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__247858783_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IGameService2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __247858783_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameService2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d2364ef6ea174be58d8ac860885e051f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameService2(ptr: Pointer?): WithDefault = IGameService2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameService2 {
      val address = segment.toRawLongValue()
      return makeIGameService2(Pointer(address))
    }

    public override fun toNative(obj: IGameService2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__247858783_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameService2): Array<IGameService2?> = (elements as
        Array<IGameService2?>).castToImpl<IGameService2,IGameService2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameService2?> =
        arrayOfNulls<IGameService2_Impl>(size) as Array<IGameService2?>
  }
}
