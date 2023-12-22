package Microsoft.UI.Input.DragDrop

import Microsoft.UI.Content.ContentIsland
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

@ABIMarker(IDragDropManagerStatics.ABI::class)
@Signature("{5587c863-57d7-5d0f-8ea9-e5dcf06a0f83}")
@Guid("5587c86357d75d0f8ea9e5dcf06a0f83")
@WinRTInterface("5587c86357d75d0f8ea9e5dcf06a0f83")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragDropManagerStatics.ByReference::class)
public interface IDragDropManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForIsland(content: ContentIsland?): DragDropManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragDropManagerStatics> {
    public override fun getValue() = ABI.makeIDragDropManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IDragDropManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragDropManagerStatics {
    public val __1996909213_Ptr: Pointer?

    public val _1996909213_VtblPtr: Pointer?
      get() = __1996909213_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForIsland(content: ContentIsland?): DragDropManager? {
      val fnPtr = _1996909213_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DragDropManager>()
      val hr = fn.invokeHR(arrayOf(__1996909213_Ptr, marshalToNative(content), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DragDropManager>(result.getValue())
      return resultValue
    }
  }

  public class IDragDropManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1996909213_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragDropManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5587c86357d75d0f8ea9e5dcf06a0f83")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragDropManagerStatics(ptr: Pointer?): WithDefault =
        IDragDropManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragDropManagerStatics {
      val address = segment.toRawLongValue()
      return makeIDragDropManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IDragDropManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1996909213_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragDropManagerStatics): Array<IDragDropManagerStatics?>
        = (elements as
        Array<IDragDropManagerStatics?>).castToImpl<IDragDropManagerStatics,IDragDropManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragDropManagerStatics?> =
        arrayOfNulls<IDragDropManagerStatics_Impl>(size) as Array<IDragDropManagerStatics?>
  }
}
