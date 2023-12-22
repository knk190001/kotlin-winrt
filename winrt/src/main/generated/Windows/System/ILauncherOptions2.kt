package Windows.System

import Windows.Storage.Search.StorageFileQueryResult
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

@ABIMarker(ILauncherOptions2.ABI::class)
@Signature("{3ba08eb4-6e40-4dce-a1a3-2f53950afb49}")
@Guid("3ba08eb46e404dcea1a32f53950afb49")
@WinRTInterface("3ba08eb46e404dcea1a32f53950afb49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILauncherOptions2.ByReference::class)
public interface ILauncherOptions2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetApplicationPackageFamilyName(): String?

  @InterfaceMethod(1)
  public fun put_TargetApplicationPackageFamilyName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_NeighboringFilesQuery(): StorageFileQueryResult?

  @InterfaceMethod(3)
  public fun put_NeighboringFilesQuery(value: StorageFileQueryResult?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILauncherOptions2> {
    public override fun getValue() = ABI.makeILauncherOptions2(pointer.getPointer(0))

    public fun setValue(value: ILauncherOptions2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILauncherOptions2 {
    public val __1132038787_Ptr: Pointer?

    public val _1132038787_VtblPtr: Pointer?
      get() = __1132038787_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetApplicationPackageFamilyName(): String? {
      val fnPtr = _1132038787_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1132038787_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TargetApplicationPackageFamilyName(value: String?): Unit {
      val fnPtr = _1132038787_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1132038787_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_NeighboringFilesQuery(): StorageFileQueryResult? {
      val fnPtr = _1132038787_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFileQueryResult>()
      val hr = fn.invokeHR(arrayOf(__1132038787_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFileQueryResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_NeighboringFilesQuery(value: StorageFileQueryResult?): Unit {
      val fnPtr = _1132038787_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1132038787_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILauncherOptions2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1132038787_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILauncherOptions2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ba08eb46e404dcea1a32f53950afb49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILauncherOptions2(ptr: Pointer?): WithDefault = ILauncherOptions2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILauncherOptions2 {
      val address = segment.toRawLongValue()
      return makeILauncherOptions2(Pointer(address))
    }

    public override fun toNative(obj: ILauncherOptions2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1132038787_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILauncherOptions2): Array<ILauncherOptions2?> = (elements
        as Array<ILauncherOptions2?>).castToImpl<ILauncherOptions2,ILauncherOptions2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILauncherOptions2?> =
        arrayOfNulls<ILauncherOptions2_Impl>(size) as Array<ILauncherOptions2?>
  }
}
