package Windows.Storage

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

@ABIMarker(IKnownFoldersStatics2.ABI::class)
@Signature("{194bd0cd-cf6e-4d07-9d53-e9163a2536e9}")
@Guid("194bd0cdcf6e4d079d53e9163a2536e9")
@WinRTInterface("194bd0cdcf6e4d079d53e9163a2536e9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownFoldersStatics2.ByReference::class)
public interface IKnownFoldersStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Objects3D(): StorageFolder?

  @InterfaceMethod(1)
  public fun get_AppCaptures(): StorageFolder?

  @InterfaceMethod(2)
  public fun get_RecordedCalls(): StorageFolder?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownFoldersStatics2> {
    public override fun getValue() = ABI.makeIKnownFoldersStatics2(pointer.getPointer(0))

    public fun setValue(value: IKnownFoldersStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownFoldersStatics2 {
    public val __872774072_Ptr: Pointer?

    public val _872774072_VtblPtr: Pointer?
      get() = __872774072_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Objects3D(): StorageFolder? {
      val fnPtr = _872774072_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__872774072_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AppCaptures(): StorageFolder? {
      val fnPtr = _872774072_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__872774072_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RecordedCalls(): StorageFolder? {
      val fnPtr = _872774072_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__872774072_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }
  }

  public class IKnownFoldersStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __872774072_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownFoldersStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("194bd0cdcf6e4d079d53e9163a2536e9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownFoldersStatics2(ptr: Pointer?): WithDefault =
        IKnownFoldersStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKnownFoldersStatics2 {
      val address = segment.toRawLongValue()
      return makeIKnownFoldersStatics2(Pointer(address))
    }

    public override fun toNative(obj: IKnownFoldersStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__872774072_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownFoldersStatics2): Array<IKnownFoldersStatics2?> =
        (elements as
        Array<IKnownFoldersStatics2?>).castToImpl<IKnownFoldersStatics2,IKnownFoldersStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownFoldersStatics2?> =
        arrayOfNulls<IKnownFoldersStatics2_Impl>(size) as Array<IKnownFoldersStatics2?>
  }
}
