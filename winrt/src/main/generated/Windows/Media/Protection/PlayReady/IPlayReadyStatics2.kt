package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.PlayReady.IPlayReadyStatics.ABI.IID
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayReadyStatics2.ABI::class)
@Signature("{1f8d6a92-5f9a-423e-9466-b33969af7a3d}")
@Guid("1f8d6a925f9a423e9466b33969af7a3d")
@WinRTInterface("1f8d6a925f9a423e9466b33969af7a3d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyStatics2.ByReference::class)
public interface IPlayReadyStatics2 : NativeMapped, IWinRTInterface, IPlayReadyStatics {
  @InterfaceMethod(0)
  public fun get_PlayReadyCertificateSecurityLevel(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyStatics2> {
    public override fun getValue() = ABI.makeIPlayReadyStatics2(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyStatics2, IPlayReadyStatics.WithDefault {
    public val __574261826_Ptr: Pointer?

    public val _574261826_VtblPtr: Pointer?
      get() = __574261826_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlayReadyCertificateSecurityLevel(): WinDef.UINT {
      val fnPtr = _574261826_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__574261826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IPlayReadyStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPlayReadyStatics {
    public override val __1505496080_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_574261826_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __574261826_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1f8d6a925f9a423e9466b33969af7a3d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyStatics2(ptr: Pointer?): WithDefault = IPlayReadyStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyStatics2 {
      val address = segment.toRawLongValue()
      return makeIPlayReadyStatics2(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__574261826_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyStatics2): Array<IPlayReadyStatics2?> =
        (elements as
        Array<IPlayReadyStatics2?>).castToImpl<IPlayReadyStatics2,IPlayReadyStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyStatics2?> =
        arrayOfNulls<IPlayReadyStatics2_Impl>(size) as Array<IPlayReadyStatics2?>
  }
}
