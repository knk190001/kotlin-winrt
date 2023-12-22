package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.PlayReady.IPlayReadyLicenseSession.ABI.IID
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

@ABIMarker(IPlayReadyLicenseSession2.ABI::class)
@Signature("{4909be3a-3aed-4656-8ad7-ee0fd7799510}")
@Guid("4909be3a3aed46568ad7ee0fd7799510")
@WinRTInterface("4909be3a3aed46568ad7ee0fd7799510")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyLicenseSession2.ByReference::class)
public interface IPlayReadyLicenseSession2 : NativeMapped, IWinRTInterface, IPlayReadyLicenseSession
    {
  @InterfaceMethod(0)
  public fun CreateLicenseIterable(contentHeader: PlayReadyContentHeader?, fullyEvaluated: Boolean):
      PlayReadyLicenseIterable?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyLicenseSession2> {
    public override fun getValue() = ABI.makeIPlayReadyLicenseSession2(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyLicenseSession2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyLicenseSession2, IPlayReadyLicenseSession.WithDefault {
    public val __1372160232_Ptr: Pointer?

    public val _1372160232_VtblPtr: Pointer?
      get() = __1372160232_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateLicenseIterable(contentHeader: PlayReadyContentHeader?,
        fullyEvaluated: Boolean): PlayReadyLicenseIterable? {
      val fnPtr = _1372160232_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadyLicenseIterable>()
      val hr = fn.invokeHR(arrayOf(__1372160232_Ptr, marshalToNative(contentHeader), fullyEvaluated,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadyLicenseIterable>(result.getValue())
      return resultValue
    }
  }

  public class IPlayReadyLicenseSession2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPlayReadyLicenseSession {
    public override val __1756852086_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1372160232_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1372160232_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyLicenseSession2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4909be3a3aed46568ad7ee0fd7799510")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyLicenseSession2(ptr: Pointer?): WithDefault =
        IPlayReadyLicenseSession2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyLicenseSession2 {
      val address = segment.toRawLongValue()
      return makeIPlayReadyLicenseSession2(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyLicenseSession2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1372160232_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyLicenseSession2):
        Array<IPlayReadyLicenseSession2?> = (elements as
        Array<IPlayReadyLicenseSession2?>).castToImpl<IPlayReadyLicenseSession2,IPlayReadyLicenseSession2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyLicenseSession2?> =
        arrayOfNulls<IPlayReadyLicenseSession2_Impl>(size) as Array<IPlayReadyLicenseSession2?>
  }
}
