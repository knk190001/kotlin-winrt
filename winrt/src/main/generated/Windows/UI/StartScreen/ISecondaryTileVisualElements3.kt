package Windows.UI.StartScreen

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

@ABIMarker(ISecondaryTileVisualElements3.ABI::class)
@Signature("{56b55ad6-d15c-40f4-81e7-57ffd8f8a4e9}")
@Guid("56b55ad6d15c40f481e757ffd8f8a4e9")
@WinRTInterface("56b55ad6d15c40f481e757ffd8f8a4e9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecondaryTileVisualElements3.ByReference::class)
public interface ISecondaryTileVisualElements3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Square44x44Logo(value: Uri?): Unit

  @InterfaceMethod(1)
  public fun get_Square44x44Logo(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryTileVisualElements3> {
    public override fun getValue() = ABI.makeISecondaryTileVisualElements3(pointer.getPointer(0))

    public fun setValue(value: ISecondaryTileVisualElements3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryTileVisualElements3 {
    public val __696839292_Ptr: Pointer?

    public val _696839292_VtblPtr: Pointer?
      get() = __696839292_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Square44x44Logo(value: Uri?): Unit {
      val fnPtr = _696839292_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__696839292_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Square44x44Logo(): Uri? {
      val fnPtr = _696839292_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__696839292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class ISecondaryTileVisualElements3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __696839292_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryTileVisualElements3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("56b55ad6d15c40f481e757ffd8f8a4e9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryTileVisualElements3(ptr: Pointer?): WithDefault =
        ISecondaryTileVisualElements3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISecondaryTileVisualElements3 {
      val address = segment.toRawLongValue()
      return makeISecondaryTileVisualElements3(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryTileVisualElements3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__696839292_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryTileVisualElements3):
        Array<ISecondaryTileVisualElements3?> = (elements as
        Array<ISecondaryTileVisualElements3?>).castToImpl<ISecondaryTileVisualElements3,ISecondaryTileVisualElements3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISecondaryTileVisualElements3?> =
        arrayOfNulls<ISecondaryTileVisualElements3_Impl>(size) as
        Array<ISecondaryTileVisualElements3?>
  }
}
