package Windows.Data.Xml.Dom

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

@ABIMarker(XmlProcessingInstruction.ABI::class)
@Signature("rc(Windows.Data.Xml.Dom.XmlProcessingInstruction;{2707fd1e-1e92-4ece-b6f4-26f069078ddc})")
@WinRTByReference(brClass = XmlProcessingInstruction.ByReference::class)
public class XmlProcessingInstruction(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXmlProcessingInstruction.WithDefault, IXmlNode.WithDefault,
    IXmlNodeSerializer.WithDefault, IXmlNodeSelector.WithDefault, IWinRTObject {
  private val __154536165_Interface: IXmlProcessingInstruction.WithDefault by lazy {
    as_154536165()
  }


  private val __306630242_Interface: IXmlNode.WithDefault by lazy {
    as_306630242()
  }


  private val __849932908_Interface: IXmlNodeSerializer.WithDefault by lazy {
    as_849932908()
  }


  private val __1968462751_Interface: IXmlNodeSelector.WithDefault by lazy {
    as_1968462751()
  }


  public override val __154536165_Ptr: JNAPointer? by lazy {
    __154536165_Interface.__154536165_Ptr
  }


  public override val __306630242_Ptr: JNAPointer? by lazy {
    __306630242_Interface.__306630242_Ptr
  }


  public override val __849932908_Ptr: JNAPointer? by lazy {
    __849932908_Interface.__849932908_Ptr
  }


  public override val __1968462751_Ptr: JNAPointer? by lazy {
    __1968462751_Interface.__1968462751_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__154536165_Interface, __306630242_Interface, __849932908_Interface,
        __1968462751_Interface)

  private fun as_154536165(): IXmlProcessingInstruction.WithDefault {
    if(pointer == NULL) {
      return(IXmlProcessingInstruction.ABI.makeIXmlProcessingInstruction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXmlProcessingInstruction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlProcessingInstruction.ABI.makeIXmlProcessingInstruction(ref.value))
  }

  private fun as_306630242(): IXmlNode.WithDefault {
    if(pointer == NULL) {
      return(IXmlNode.ABI.makeIXmlNode(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXmlNode>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlNode.ABI.makeIXmlNode(ref.value))
  }

  private fun as_849932908(): IXmlNodeSerializer.WithDefault {
    if(pointer == NULL) {
      return(IXmlNodeSerializer.ABI.makeIXmlNodeSerializer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXmlNodeSerializer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlNodeSerializer.ABI.makeIXmlNodeSerializer(ref.value))
  }

  private fun as_1968462751(): IXmlNodeSelector.WithDefault {
    if(pointer == NULL) {
      return(IXmlNodeSelector.ABI.makeIXmlNodeSelector(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXmlNodeSelector>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlNodeSelector.ABI.makeIXmlNodeSelector(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XmlProcessingInstruction> {
    public override fun getValue() = XmlProcessingInstruction(pointer.getPointer(0))

    public fun setValue(value: XmlProcessingInstruction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XmlProcessingInstruction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): XmlProcessingInstruction {
      val address = segment.toRawLongValue()
      return XmlProcessingInstruction(Pointer(address))
    }

    public override fun toNative(obj: XmlProcessingInstruction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
