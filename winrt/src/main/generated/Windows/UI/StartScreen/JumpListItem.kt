package Windows.UI.StartScreen

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(JumpListItem.ABI::class)
@Signature("rc(Windows.UI.StartScreen.JumpListItem;{7adb6717-8b5d-4820-995b-9b418dbe48b0})")
@WinRTByReference(brClass = JumpListItem.ByReference::class)
public class JumpListItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IJumpListItem.WithDefault, IWinRTObject {
  private val __1237296777_Interface: IJumpListItem.WithDefault by lazy {
    as_1237296777()
  }


  public override val __1237296777_Ptr: JNAPointer? by lazy {
    __1237296777_Interface.__1237296777_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1237296777_Interface)

  private fun as_1237296777(): IJumpListItem.WithDefault {
    if(pointer == NULL) {
      return(IJumpListItem.ABI.makeIJumpListItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IJumpListItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJumpListItem.ABI.makeIJumpListItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<JumpListItem> {
    public override fun getValue() = JumpListItem(pointer.getPointer(0))

    public fun setValue(value: JumpListItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<JumpListItem, MemoryAddress> {
    public val IJumpListItemStatics_Instance: IJumpListItemStatics by lazy {
      createIJumpListItemStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIJumpListItemStatics(): IJumpListItemStatics {
      val refiid = Guid.REFIID(IJumpListItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.StartScreen.JumpListItem".toHandle(),refiid,interfacePtr)
      val result = IJumpListItemStatics.ABI.makeIJumpListItemStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): JumpListItem {
      val address = segment.toRawLongValue()
      return JumpListItem(Pointer(address))
    }

    public override fun toNative(obj: JumpListItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateWithArguments(arguments: String, displayName: String) =
        ABI.IJumpListItemStatics_Instance.CreateWithArguments(arguments, displayName)

    public fun CreateSeparator() = ABI.IJumpListItemStatics_Instance.CreateSeparator()
  }
}
