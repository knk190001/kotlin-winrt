package Microsoft.UI.Content

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ContentIslandEnvironment.ABI::class)
@Signature("rc(Microsoft.UI.Content.ContentIslandEnvironment;{c334236d-da88-566d-811d-74aef2eba978})")
@WinRTByReference(brClass = ContentIslandEnvironment.ByReference::class)
public class ContentIslandEnvironment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentIslandEnvironment.WithDefault, IContentIslandEnvironment2.WithDefault,
    IWinRTObject {
  private val __2013746031_Interface: IContentIslandEnvironment.WithDefault by lazy {
    as_2013746031()
  }


  private val __1998382429_Interface: IContentIslandEnvironment2.WithDefault by lazy {
    as_1998382429()
  }


  public override val __2013746031_Ptr: JNAPointer? by lazy {
    __2013746031_Interface.__2013746031_Ptr
  }


  public override val __1998382429_Ptr: JNAPointer? by lazy {
    __1998382429_Interface.__1998382429_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2013746031_Interface, __1998382429_Interface)

  private fun as_2013746031(): IContentIslandEnvironment.WithDefault {
    if(pointer == NULL) {
      return(IContentIslandEnvironment.ABI.makeIContentIslandEnvironment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentIslandEnvironment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentIslandEnvironment.ABI.makeIContentIslandEnvironment(ref.value))
  }

  private fun as_1998382429(): IContentIslandEnvironment2.WithDefault {
    if(pointer == NULL) {
      return(IContentIslandEnvironment2.ABI.makeIContentIslandEnvironment2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentIslandEnvironment2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentIslandEnvironment2.ABI.makeIContentIslandEnvironment2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentIslandEnvironment> {
    public override fun getValue() = ContentIslandEnvironment(pointer.getPointer(0))

    public fun setValue(value: ContentIslandEnvironment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentIslandEnvironment, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContentIslandEnvironment {
      val address = segment.toRawLongValue()
      return ContentIslandEnvironment(Pointer(address))
    }

    public override fun toNative(obj: ContentIslandEnvironment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
