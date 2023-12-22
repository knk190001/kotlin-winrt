package Windows.Storage

import Windows.System.User
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppDataPathsStatics.ABI::class)
@Signature("{d8eb2afe-a9d9-4b14-b999-e3921379d903}")
@Guid("d8eb2afea9d94b14b999e3921379d903")
@WinRTInterface("d8eb2afea9d94b14b999e3921379d903")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppDataPathsStatics.ByReference::class)
public interface IAppDataPathsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUser(user: User?): AppDataPaths?

  @InterfaceMethod(1)
  public fun GetDefault(): AppDataPaths?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppDataPathsStatics> {
    public override fun getValue() = ABI.makeIAppDataPathsStatics(pointer.getPointer(0))

    public fun setValue(value: IAppDataPathsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppDataPathsStatics {
    public val __1163432649_Ptr: Pointer?

    public val _1163432649_VtblPtr: Pointer?
      get() = __1163432649_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUser(user: User?): AppDataPaths? {
      val fnPtr = _1163432649_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppDataPaths>()
      val hr = fn.invokeHR(arrayOf(__1163432649_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppDataPaths>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDefault(): AppDataPaths? {
      val fnPtr = _1163432649_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppDataPaths>()
      val hr = fn.invokeHR(arrayOf(__1163432649_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppDataPaths>(result.getValue())
      return resultValue
    }
  }

  public class IAppDataPathsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1163432649_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppDataPathsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d8eb2afea9d94b14b999e3921379d903")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppDataPathsStatics(ptr: Pointer?): WithDefault = IAppDataPathsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppDataPathsStatics {
      val address = segment.toRawLongValue()
      return makeIAppDataPathsStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppDataPathsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1163432649_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppDataPathsStatics): Array<IAppDataPathsStatics?> =
        (elements as
        Array<IAppDataPathsStatics?>).castToImpl<IAppDataPathsStatics,IAppDataPathsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppDataPathsStatics?> =
        arrayOfNulls<IAppDataPathsStatics_Impl>(size) as Array<IAppDataPathsStatics?>
  }
}
